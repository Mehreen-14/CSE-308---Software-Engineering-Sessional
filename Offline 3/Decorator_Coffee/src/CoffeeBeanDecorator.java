public class CoffeeBeanDecorator extends CondimentDecorator{

    Beverage beverage;
    private String description = ", Coffee Beans - 30Tk";
    private double cost = 30;

    public CoffeeBeanDecorator(Beverage beverage){
       // System.out.println("Coffee Beans");
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        description = this.beverage.getDescription()+description;
        return description;
    }

    //public void setCost(){
      //  this.beverage.setCost(this.beverage.getCost()+cost);
   // }
    @Override
    public double getCost() {
        cost = this.beverage.getCost()+cost;
        return cost;
    }
}