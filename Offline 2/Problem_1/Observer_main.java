import java.util.Scanner;

public class Observer_main {
    public static void main(String[] args) {
        ABC_Company abc = new ABC_Company();
        regular regular = new regular(abc,1);
        premium premium = new premium(abc,0);

        abc.add(regular,1);
        abc.add(premium,0);

        while(true){
            System.out.println("Processing State Changing:");
            System.out.println("1.Partially Down");
            System.out.println("2.Fully Down");
            Scanner in = new Scanner(System.in);
            int state;
            state = in.nextInt();
            if(state==1 || state==2) {
                abc.setState(state);
            }
            else{
                System.out.println("Invalid Input");
            }

        }
    }
}
