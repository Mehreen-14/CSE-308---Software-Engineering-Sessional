public class RegularBlackCoffee extends Beverage{
    private String description = "Water, Coffee beans - 30Tk";
    private double cost = 130;
    public RegularBlackCoffee(){
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
