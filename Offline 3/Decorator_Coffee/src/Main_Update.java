import java.util.Scanner;

public class Main_Update {
    public static void main(String[] args) {
        System.out.println("Welcome to কফির টং");
        System.out.println("Order coffee:");
        Scanner input = new Scanner(System.in);
        //InputTaking inputTaking = new InputTaking();
        String in,op;
        double pp;
        double price = 0;
        while(true) {
            System.out.println("1. Americano");
            System.out.println("2. Espresso");
            System.out.println("3. Cappuccino");
            System.out.println("4. Mocha");
            in = input.next();
            if(in.equalsIgnoreCase("1")){
                CoffeeBeanDecorator americano = new CoffeeBeanDecorator(new RegularBlackCoffee());
                System.out.println("Ingredients");
                System.out.println(americano.getDescription());
                pp = americano.getCost();
                System.out.println("Cost: "+pp+"Tk");
                price+=pp;
            }
            else if(in.equalsIgnoreCase("2")){
                DairyCreamDecorator espresso = new DairyCreamDecorator(new RegularBlackCoffee());
                System.out.println("Ingredients");
                System.out.println(espresso.getDescription());
                pp = espresso.getCost();
                System.out.println("Cost: "+pp+"Tk");
                price+=pp;
            }

            else if(in.equalsIgnoreCase("3")){
                CinnamonDecorator cappuccino = new CinnamonDecorator(new RegularMilkCoffee());
                System.out.println("Ingredients");
                System.out.println(cappuccino.getDescription());
                pp = cappuccino.getCost();
                System.out.println("Cost: "+pp+"Tk");
                price+=pp;
            }
            else if(in.equalsIgnoreCase("4")){
                ChocolateDecorator mocha = new ChocolateDecorator(new RegularMilkCoffee());
                System.out.println("Ingredients");
                System.out.println(mocha.getDescription());
                pp = mocha.getCost();
                System.out.println("Cost: "+pp+"Tk");
                price+=pp;
            }
            else if(in.equalsIgnoreCase("ok")){
                System.out.println("Total Price: "+price+"Tk");
                break;
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}
