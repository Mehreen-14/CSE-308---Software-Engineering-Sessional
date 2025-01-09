public class RegularMilkCoffee extends Beverage{
    private String description = "Milk - 50Tk , Coffee beans - 30Tk";
    private double cost = 180;

    public RegularMilkCoffee(){
        System.out.println("Coffee Mug - 100 Tk");
    }
    public String getDescription() {
        return description;
    }


    @Override
    public double getCost() {
        return cost;
    }
}
