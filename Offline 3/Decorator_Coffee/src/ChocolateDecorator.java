public class ChocolateDecorator extends CondimentDecorator{

    Beverage beverage;
    private String description = ", Chocolate - 60Tk";
    private double cost = 60;

    public ChocolateDecorator(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        description = this.beverage.getDescription()+description;
        return description;
    }

//    public void setCost(){
//        this.beverage.setCost(this.beverage.getCost()+cost);
//    }
    @Override
    public double getCost() {
        return this.beverage.getCost()+cost;
    }
}