import java.util.Vector;

public class Director {
    Builder pcbuilder;
    PC pc = new PC();
    String gc = null,ram = null;
    int ram_count = 0,gc_count = 0; //how many are added
    Vector<String> count_ram = new Vector<>(); //Storing ram data
    Vector<String> count_gc = new Vector<>(); //Storing graphics card data
    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void Construct(Builder builder){
        pcbuilder = builder;
        pcbuilder.build();
        //pc = builder.getPc();
        //pcbuilder.AddGCard();
        //pcbuilder.AddRam();
    }


    //extra
    int pr_price,extra_price;

    public PC getPC(){
        return pc;
    }

    public void AddRam(String ram){
       // System.out.println("Ram Addition :");
        if(ram.equalsIgnoreCase("2666 MHz")){

            setRam(ram);
            count_ram.add(ram);
            ram_count++;
            System.out.println(pc.getTotal());
            //System.out.println("8 GB DDR4 RAM : 2666 MHz Added");
            pc.setTotal(2620);
        }
        else if(ram.equalsIgnoreCase("3200 MHz")){
            //System.out.println("8 GB DDR4 RAM : 3200 MHz Added");
            setRam(ram);
            count_ram.add(ram);
            ram_count++;
            pc.setTotal(2950);
        }
    }
    public void AddGCard(String gcard){
      //  System.out.println("Graphics Card Addition :");
        if(gcard.equalsIgnoreCase("2GB")){
            setGc(gcard);
            count_gc.add(gcard);
            gc_count++;
            //System.out.println("2GB Graphics Card Added");
            pc.setTotal(6500);
        }
        else if(gcard.equalsIgnoreCase("4GB")){
            setGc(gcard);
            count_gc.add(gcard);
            gc_count++;
            //System.out.println("$GB Graphics Card Added");
            pc.setTotal(7600);
        }
    }

    public void Print_ram_gc(){
        System.out.println("Added Components :");
       if(getGc() != null){
           System.out.println("GRAPHICS CARD :");
          for (int i=0;i<count_gc.size();i++)
          {
              System.out.println(count_gc.elementAt(i)+" Added");
          }
       }
       else {
           System.out.println("No Graphics card added");
       }

       if(getRam() != null){
           System.out.println("RAM :");
           for (int i=0;i<count_ram.size();i++)
           {
               System.out.println(count_ram.elementAt(i)+" Added");
           }
       }
       else {
           System.out.println("No RAM added");
       }
        System.out.println("Total : "+pc.getTotal() + " BDT");
       count_ram.clear();
       count_gc.clear();
    }
}
