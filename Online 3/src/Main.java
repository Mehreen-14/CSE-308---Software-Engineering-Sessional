import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        service_implementation aKash = new aKash();
        service_implementation dharai = new D_Harai();
        service_implementation payfren = new PayFren();
        transaction_abstraction tr = new user(aKash);

        Scanner in = new Scanner(System.in);
        int id;
        double deposit;
        id = in.nextInt();
        deposit = in.nextDouble();
        tr.setID(id);
        tr.setDeposit(deposit);
        tr.Msg();
        System.out.println(tr.getID());
        System.out.println(tr.getdeposit());


        tr.change_service(payfren);
        tr.setID(id);
        tr.setDeposit(deposit*0.01);
        tr.Msg();
        System.out.println(tr.getID());
        System.out.println(tr.getdeposit());

        tr.change_service(dharai);
        tr.setID(id);
        tr.setDeposit(deposit*2);
        tr.Msg();
        System.out.println(tr.getID());
        System.out.println(tr.getdeposit());


    }
}
