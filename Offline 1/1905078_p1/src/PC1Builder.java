public class PC1Builder extends Builder{
    //PC pc = new PC("11th generation intel processor Core i5","1 TB HDD","Standard","CPU cooler","PC1",20000);
    PC pc = new PC();
    @Override
    public void build() {
        pc.setProcessor("11th generation intel processor Core i5");
        pc.setHdd("1 TB HDD");
        pc.setMb("Standard");
        pc.setExtra("CPU cooler");
        pc.setType("PC-1");
        pc.setTotal(56000); //36000+20000
        pc.Print();
    }
}
