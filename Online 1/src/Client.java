import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Director director = new Director();
        Builder builder = new Builder();

        System.out.println("Do you want to place order?(Y/N)");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int i = scan.nextInt();


        if(i == 1) {
            director.constructBase(builder);
            while(true) {
                System.out.println("1.Patty 2.Cheese 3.BBQSauce 4.Salad 5.Exit");
                int j = scan.nextInt();
                if (j >= 1 && j < 5) {
                   director.addIngredient(j);
                }
                else {
                    break;
                }
            }
        }
        Burger yourBurger = director.getYourBurger();
        yourBurger.printIngredient();
    }
}
