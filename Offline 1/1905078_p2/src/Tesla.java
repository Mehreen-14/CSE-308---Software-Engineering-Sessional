public class Tesla implements Car {

    @Override
    public void getCountry() {
        System.out.println("Manufacturing country: US");
    }

    @Override
    public void getDrive() {
        System.out.println("Drive : All");
    }

    @Override
    public void getEngine() {
        System.out.println("Engine : Electric Engine");
    }
    @Override
    public void getColor() {
        System.out.println("Color : White");
    }
}
