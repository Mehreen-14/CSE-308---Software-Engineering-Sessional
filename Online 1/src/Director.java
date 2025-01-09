public class Director {
    private Builder builder;

    public void constructBase(Builder builder) {
        this.builder = builder;
        builder.addBun();
        builder.addBun();
        builder.addPatty();
    }
    public void addIngredient(int i) {
        if(i == 1) {
            builder.addPatty();
        }
        else if(i == 2) {
            builder.addCheese();
        }
        else if(i == 3) {
            builder.addBBQSauce();
        }
        else if(i == 4) {
            builder.addSalad();
        }
    }
    public Burger getYourBurger() {
        return builder.getBurger();
    }

}
