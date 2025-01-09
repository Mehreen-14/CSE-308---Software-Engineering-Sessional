public class GamingBuilder extends Builder {
    //PC pc = new PC("AMD Ryzen 7 5700X","1 TB HDD","Standard",null,"Gaming",28000);
    PC pc = new PC();

    @Override
    public void build() {
        pc.setProcessor("AMD Ryzen 7 5700X");
        pc.setHdd("1 TB HDD");
        pc.setMb("Standard");
        pc.setType("Gaming");
        pc.setExtra(null);
        pc.setTotal(28000);
        pc.Print();
    }
}
