public abstract class Beverage {
    private String description = "Unknown beverage";
    private double cost;

    public String getDescription() {
        return description;
    }

    //public void setDescription(String description) {
       // this.description = description;
    //}

//    public void setCost(double cost) {
//        this.cost = cost;
//    }

    public abstract double getCost();
}
