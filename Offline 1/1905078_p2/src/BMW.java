public class BMW implements Car {
    @Override
    public void getCountry() {
        System.out.println("Manufacturing country: Germany");
    }

    @Override
    public void getDrive() {
        System.out.println("Drive : Rear-wheel");
    }

    @Override
    public void getEngine() {
        System.out.println("Engine : Electric Engine");
    }
    @Override
    public void getColor() {
        System.out.println("Color : Black");
    }
}
