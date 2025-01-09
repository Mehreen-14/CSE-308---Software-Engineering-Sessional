public class Builder {
    private Burger burger;

    public Builder() {
        burger = new Burger();
    }

    public void addBun() {
        burger.setBun(new Bun());
    }
    public void addPatty() {
        burger.setPatty(new Patty());
    }
    public void addCheese() {
        burger.setCheese(new Cheese());
    }
    public void addBBQSauce() {
        burger.setBbqSauce(new BBQSauce());
    }
    public void addSalad() {
        burger.setSalad(new Salad());
    }
    public Burger getBurger() {
        return burger;
    }

}
