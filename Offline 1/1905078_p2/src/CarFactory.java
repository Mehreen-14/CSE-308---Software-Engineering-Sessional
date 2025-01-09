public class CarFactory {
    //getCar method for to get object of Car
    public Car getCar(String location){
        if(location == null)
            return null;
        else if(location.equalsIgnoreCase("Asian")) {
            System.out.println("Car : Toyota");
            return new Toyota();
        }
        else if(location.equalsIgnoreCase("European")) {
            System.out.println("Car : BMW");
            return new BMW();
        }
        else if(location.equalsIgnoreCase("US")) {
            System.out.println("Car : Tesla");
            return new Tesla();
        }

        return null;
    }
}
