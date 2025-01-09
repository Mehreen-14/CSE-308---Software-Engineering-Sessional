import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface ICompany {
    void add(User u,int val);
    void remove(User u,int val);
    void Notify(String curr);
    String getPrev();
    String getCurrent();

    void getMsg(int i,String s);
}

class ABC_Company implements ICompany{
    private String prev_state = "Operational",curr_state;
    List<User> userList_p = new ArrayList<>();
    List<User> userList_r = new ArrayList<>();
    private int val;
    @Override
    public void add(User u, int val) {
        if(val==0){
            val = 0;
            userList_p.add(u);
        }
        else if(val==1){
            val = 1;
            userList_r.add(u);
        }
    }

    @Override
    public void remove(User u, int val) {
        if(val==0){
            val = 0;
            userList_p.remove(u);
        }
        else if(val==1){
            val = 1;
            userList_r.remove(u);
        }
    }

    @Override
    public void Notify(String curr) {
//        if(curr.equalsIgnoreCase("operational")){
//            curr_state = curr;
//
//        }
//        curr_state = curr;
//        System.out.println("Server Side");
//        System.out.println("Current State :"+curr_state);
//        System.out.println("Previous State :"+prev_state);

            System.out.println("Notification goes to Premium Users");
            for (int i=0;i< userList_p.size();i++) {
                userList_p.get(i).update(prev_state, curr_state);

            }
                System.out.println("Notification goes to Regular Users");
                for (int i = 0; i < userList_r.size(); i++) {
                    userList_r.get(i).update(prev_state, curr_state);
                }

//        prev_state = curr;
    }

    @Override
    public String getPrev() {
        return prev_state;
    }
    public String getCurrent(){
        return curr_state;
    }

    @Override
    public void getMsg(int i,String s) {
        if(i==1){
            System.out.println("Message from Regular User: "+s);
        }
        else if(i==0){
            System.out.println("Message from Premium User: "+s);
        }
    }


    public void setState(int curr){
        if(curr==1){
        curr_state = "Partially Down";}
        else if(curr==2){
            curr_state = "Fully Down";
        }
        System.out.println("Server Side");
        System.out.println("Current State :"+curr_state);
        if(prev_state==null){
            System.out.println("Previous State : None");
        }
        else {
            System.out.println("Previous State :" + prev_state);
        }
        Notify(curr_state);
        prev_state = curr_state;

    }


}
