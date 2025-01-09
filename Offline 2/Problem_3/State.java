import java.util.Scanner;

public interface State {
    public void BuyingItem();

}
class InitialState implements State{
    VendingMachine vendingMachine;
    //private int change;
    private int op;
    Scanner in = new Scanner(System.in);
    public InitialState(VendingMachine v){
        vendingMachine = v;
    }
    @Override
    public void BuyingItem(){
        System.out.println("Product price :"+vendingMachine.getPrice()+"Tk");
        while(this.vendingMachine.getTotalProduct()!=0){
            System.out.println("Want to buy product?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            op=in.nextInt();
            if(op==1){
                System.out.println("Enter price:");
                this.vendingMachine.setState(1);
                break;
            }
            else if(op==2){
                System.out.println("Buying Item Next time");
                System.exit(0);
            }
            else{
                System.out.println("Invalid Option...Choose option between 1 and 2");
            }

        }
        if (this.vendingMachine.getTotalProduct()==0){
            System.out.println("Stock Out");
            System.exit(0);
        }
    }
}
class Order_State implements State{
    VendingMachine vendingMachine;
    Scanner in = new Scanner(System.in);
    int ok;
    public Order_State(VendingMachine vendingMachine) {
       // System.out.println("Order_State");
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void BuyingItem() {
        int cash;
        int price = this.vendingMachine.getPrice();

        while(true){
            cash = in.nextInt();
            if(cash<price){
                cash=price-cash;
                System.out.println(cash+" Tk needed");
                System.out.println("add more money");
            }
            else if(cash==price){
               // this.vendingMachine.setState(2);
               BuyingOk();
               break;
            }
            else if(cash>price){
                cash=cash-price;
                System.out.println(cash+" Returned");
                BuyingOk();
                break;
            }
            price=cash;
        }
    }
    public void BuyingOk(){
        System.out.println("Dispense the product?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        ok = in.nextInt();

        if(ok==1) {
            System.out.println("Delivering the product");
            System.out.println("Remaining Product :"+(this.vendingMachine.getTotalProduct()-1));
            this.vendingMachine.setTotalProduct(vendingMachine.getTotalProduct()-1);
            this.vendingMachine.setState(0);
           // break;
        }
        else if(ok==2){
            System.out.println("Product is not delivering");
            System.out.println(vendingMachine.getPrice()+" Tk returned");
            this.vendingMachine.setState(0);
          //  break;
        }
    }
}

