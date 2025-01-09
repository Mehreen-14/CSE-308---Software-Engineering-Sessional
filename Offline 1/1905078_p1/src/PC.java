import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class PC {
    //Hashtable<String,Integer> Added =new Hashtable<>();
    String processor,hdd,mb,extra;
    String ram,gpu;
    String type;
   // int ram_count = 0;
    //int gpu_count = 0;
    int base_price = 70000,pr_price;
    int total = 70000;
    //PC p = new PC(processor,hdd,mb,extra,type,pr_price);

//    public PC(String processor, String hdd, String mb, String extra, String type,int pr_price) {
//        this.processor = processor;
//        this.hdd = hdd;
//        this.mb = mb;
//        this.extra = extra;
//        this.type = type;
//        base_price = 70000;
//        total+=pr_price;
//    }

    public PC(){
       // total+=pr_price;
    }

    public String getType() {
        return type;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int price) {
        total+=price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

//    //public PC returnPC(){
//        return p;
//    }


    public void Print(){
        System.out.println("Components :");
        System.out.println("Processor : "+getProcessor());
        System.out.println("HDD : "+getHdd());
        System.out.println("Mother Board : "+getMb());
        System.out.println("Extra : "+getExtra());
        System.out.println("Base Price :"+base_price+"BDT");
    }
}
