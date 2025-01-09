public class MilkDecorator extends CondimentDecorator{

    Beverage beverage;
    private String description = ", Milk - 50Tk";
    private double cost = 50;

    public MilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getCost() {
        return cost;
    }
}
