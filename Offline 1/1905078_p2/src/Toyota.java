public class Toyota implements Car {
    @Override
    public void getCountry() {
        System.out.println("Manufacturing country: Japan");
    }

    @Override
    public void getDrive() {
        System.out.println("Drive : Rear-wheel");
    }

    @Override
    public void getEngine() {
        System.out.println("Engine : Hydrogen Fuel Cell");
    }
    @Override
    public void getColor() {
        System.out.println("Color : Red");
    }
}
