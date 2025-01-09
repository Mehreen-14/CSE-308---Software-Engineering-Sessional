import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class  Burger{
    private Bun bun;
    private Patty patty;
    private Cheese cheese;
    private BBQSauce bbqSauce;
    private Salad salad;
    private int basePrice;
    private int totalPrice;
    private List<Ingredient> ingredients = new ArrayList<>();


    public Burger() {
        setBasePrice(120);
        setTotalPrice(0);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Bun getBun() {
        return bun;
    }

    public void setBun(Bun bun) {
        this.bun = bun;
        ingredients.add(bun);
    }

    public Patty getPatty() {
        return patty;
    }

    public void setPatty(Patty patty) {
        this.patty = patty;
        ingredients.add(patty);
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
        ingredients.add(cheese);
    }

    public BBQSauce getBbqSauce() {
        return bbqSauce;
    }

    public void setBbqSauce(BBQSauce bbqSauce) {
        this.bbqSauce = bbqSauce;
        ingredients.add(bbqSauce);
    }

    public Salad getSalad() {
        return salad;
    }

    public void setSalad(Salad salad) {
        this.salad = salad;
        ingredients.add(salad);
    }

    public void printIngredient() {
        System.out.println("Burgers Info:");
        for(int i=0; i<ingredients.size(); i++) {
            Ingredient ingredient = ingredients.get(i);
            totalPrice+= ingredient.getPrice();
            System.out.println(ingredient.getName() + " - " + ingredient.getPrice());
        }
        System.out.println("Total Bill: " + totalPrice);
    }
}
