import java.util.Scanner;

public interface User {
    void update(String prev,String curr);
    boolean option = false;
}

//val=0 for premium users , val=1 for regular users

class regular implements User{
    protected ICompany company;
    private int val;
    Scanner input = new Scanner(System.in);
    private int op;
    public regular(ICompany company,int val){
        this.company = company;
        this.val = val;
    }

    @Override
    public void update(String prev,String curr) {
        //System.out.println("State :"+state);

        System.out.println("Regular User Side :");

        System.out.println("previous state of ABC company :"+this.company.getPrev());
        System.out.println("Current State of ABC company :"+this.company.getCurrent());
        System.out.println("Message :");
        if(prev.equalsIgnoreCase("Operational")){
            if(curr.equalsIgnoreCase("Fully down")){
                System.out.println("Want to pay $20 per hour to take service from DEF company?");
                System.out.println("1.Yes 2.No");
                op = input.nextInt();
                if(op==1) {
                    this.company.getMsg(1, "yes");
                }
                else {
                    this.company.getMsg(1, "no");
                }


            }
            else if(curr.equalsIgnoreCase("Partially down")){
                System.out.println("1.Want to continue using the limited functionality?");
                System.out.println("2.Pay $20 per hour to enjoy the full functionality taking service from server of DEF?");
                op=input.nextInt();
                if(op==1){
                    this.company.getMsg(1,"Want to continue using the limited functionality");
                }
                else if(op==2){
                    this.company.getMsg(1,"Pay $20 per hour to enjoy the full functionality taking service from server of DEF");
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else {
                System.out.println("Same State");
            }
        }
        else  if(prev.equalsIgnoreCase("Fully down")){
            if(curr.equalsIgnoreCase("Operational")){
                System.out.println("Total Bill : 2000Tk");
            }
            else if(curr.equalsIgnoreCase("Partially down")){
                //System.out.println("Want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF?");
                System.out.println("Notified");
            }
            else {
                System.out.println("Same State");
            }
        }
        else  if(prev.equalsIgnoreCase("Partially down")){
            if(curr.equalsIgnoreCase("Operational")){
                System.out.println("Total Bill : 2000Tk");
            }
            else if(curr.equalsIgnoreCase("Fully down")){
                //System.out.println("Want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF?");
                System.out.println("Notified...");
            }
            else {
                System.out.println("Same State");
            }
        }
    }


}

class premium implements User{
    protected ICompany company;
    private int val;
    private int op;
    boolean flag;//taking service from 2 company or DEF company ::: true:1 false : 2
    Scanner input = new Scanner(System.in);

    public premium(ICompany company,int val){
        this.company = company;
        this.val = val;
    }

    @Override
    public void update(String prev,String curr) {
        //System.out.println("State :"+state);

        System.out.println("Premium User Side :");

        System.out.println("previous state of ABC company :"+this.company.getPrev());
        System.out.println("Current State of ABC company :"+this.company.getCurrent());
        System.out.println("Message :");
        if(prev.equalsIgnoreCase("Operational")){
            if(curr.equalsIgnoreCase("Fully down")){
                System.out.println("The service is now provided by DEF company");
            }
            else if(curr.equalsIgnoreCase("Partially down")){
                System.out.println("1.Get services from 2 servers");
                System.out.println("2.Get services from DEF company");
                op=input.nextInt();
                if(op==1){
                    flag = true;
                    this.company.getMsg(0,"Get services from 2 servers");
                }
                else if(op==2){
                    flag = false;
                    this.company.getMsg(0,"Get services from DEF company");
                    this.company.remove(this,0);
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else {
                System.out.println("Same State");
            }
        }
        else  if(prev.equalsIgnoreCase("Partially down")){
            if(curr.equalsIgnoreCase("Operational")){
                System.out.println("notified regular user");
            }
            else if(curr.equalsIgnoreCase("Fully down")){
                //System.out.println("Want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF?");
                if(flag==true){
                    System.out.println("All services shifted to DEF company");
                    this.company.remove(this,0);
                    flag=false;
                }
                else {
                    System.out.println("notified.....");
                }
            }
            else {
                System.out.println("Same State");
            }
        }
    }
}