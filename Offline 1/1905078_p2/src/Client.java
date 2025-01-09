import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter Continental Location : ");
        Scanner sc = new Scanner(System.in);
        String location = sc.nextLine();
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(location);
        car.getCountry();
        car.getDrive();
        car.getEngine();
        car.getColor();
    }
}
