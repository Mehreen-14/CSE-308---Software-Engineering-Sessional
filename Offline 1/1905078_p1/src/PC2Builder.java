public class PC2Builder extends Builder{
   // PC pc = new PC("11th generation intel processor Core i7","1 TB HDD","Standard","Liquid cooler","PC2",37000);
    PC pc = new PC();
    @Override
    public void build() {
        pc.setProcessor("11th generation intel processor Core i7");
        pc.setHdd("1 TB HDD");
        pc.setMb("Standard");
        pc.setExtra("Liquid cooler");
        pc.setType("PC-2");
        pc.setTotal(54000);
        pc.Print();
    }
}
