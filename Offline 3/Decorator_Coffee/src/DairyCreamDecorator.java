public class DairyCreamDecorator extends CondimentDecorator{

    Beverage beverage;
    private String description = ", Dairy Cream - 40Tk";
    private double cost = 40;

    public DairyCreamDecorator(Beverage beverage){
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