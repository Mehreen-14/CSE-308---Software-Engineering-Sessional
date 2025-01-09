public class PC3Builder extends Builder{
    //PC pc = new PC("11th generation intel processor Core i9","1 TB HDD","Standard","DVD drive","PC3",65000);
    PC pc = new PC();
    @Override
    public void build() {
        pc.setProcessor("11th generation intel processor Core i9");
        pc.setHdd("1 TB HDD");
        pc.setMb("Standard");
        pc.setExtra("DVD Drive");
        pc.setType("PC-3");
        pc.setTotal(71000);
        pc.Print();
    }
}
