public class CinnamonDecorator extends CondimentDecorator{

    Beverage beverage;
    private String description = ", Cinnamon - 50Tk";
    private double cost = 50;

    public CinnamonDecorator(Beverage beverage){
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
       // System.out.println("Cinnamon "+this.beverage.getCost()+cost);
        return this.beverage.getCost()+cost;
    }
}