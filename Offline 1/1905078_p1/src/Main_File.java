import java.util.Scanner;

public class Main_File {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Director director = new Director();
        Builder gaming = new GamingBuilder();
        // director.Construct(gaming);
        Builder pc1 = new PC1Builder();
        Builder pc2 = new PC2Builder();
        Builder pc3 = new PC3Builder();
        int p = 1;
        int order=0;
        int op_1,op_2;
        while (true){
            String input = in.nextLine();
            if(!(input.equals("O")||input.equals("E")))
            {
                System.out.println("Give valid input between O and E");
            }
            else{
                if(input.equals("E"))
                {
                    break;
                }
                else{
                    while(true){
                        if(p==1){
                            System.out.println("Enter an option: ");
                            System.out.println("a. Gaming PC");
                            System.out.println("b. PC-1");
                            System.out.println("c. PC-2");
                            System.out.println("d. PC-3");
                        }
                        String op = in.nextLine();

                        if(op.equals("O")){
                            System.out.println("Can't Order Now.You have to close current order");
                           // break;
                            p=0;
                        }
                        else if(op.equals("E")){
                            if(order<1) {
                                System.out.println("Order at least one PC");
                                p=1;
                                //System.out.println("p:"+p);
                                break;
                            }
                            else {
                                p=1;
                               // System.out.println("p: "+p);
                                break;
                            }
                        }
                        else if(op.equals("a")){
                            while (true) {
                                System.out.println("Want to add ram?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_1 = in.nextInt();
                                if (op_1 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String ram = in.nextLine();
                                    director.AddRam(ram);
                                } else if(op_1==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }

                            while (true) {
                                System.out.println("Want to add graphics card?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_2 = in.nextInt();
                                if (op_2 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String gc = in.nextLine();
                                    director.AddGCard(gc);
                                } else if(op_2==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }
                            director.Construct(gaming);
                            // System.out.println(director.getPC().getTotal());
                            director.Print_ram_gc();
                            //gaming.build();
                        }

                        else if (op.equals("b")) {
                            while (true) {
                                System.out.println("Want to add ram?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_1 = in.nextInt();
                                if (op_1 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String ram = in.nextLine();
                                    director.AddRam(ram);
                                } else if(op_1==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }

                            while (true) {
                                System.out.println("Want to add graphics card?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_2 = in.nextInt();
                                if (op_2 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String gc = in.nextLine();
                                    director.AddGCard(gc);
                                } else if(op_2==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }
                            director.Construct(pc1);
                            // System.out.println(director.getPC().getTotal());
                            director.Print_ram_gc();
                            //gaming.build();
                        } else if (op.equals("c")) {
                            while (true) {
                                System.out.println("Want to add ram?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_1 = in.nextInt();
                                if (op_1 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String ram = in.nextLine();
                                    director.AddRam(ram);
                                } else if(op_1==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }

                            while (true) {
                                System.out.println("Want to add graphics card?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_2 = in.nextInt();
                                if (op_2 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String gc = in.nextLine();
                                    director.AddGCard(gc);
                                } else if(op_2==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }
                            director.Construct(pc2);
                            // System.out.println(director.getPC().getTotal());
                            director.Print_ram_gc();
                            //gaming.build();
                        } else if (op.equals("d")) {
                            while (true) {
                                System.out.println("Want to add ram?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_1 = in.nextInt();
                                if (op_1 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String ram = in.nextLine();
                                    director.AddRam(ram);
                                } else if(op_1==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }

                            while (true) {
                                System.out.println("Want to add graphics card?");
                                System.out.println("press 1 for yes and 0 for no");
                                op_2 = in.nextInt();
                                if (op_2 == 1) {  //yes
                                    System.out.println("Give type: ");
                                    in.nextLine();
                                    String gc = in.nextLine();
                                    director.AddGCard(gc);
                                }else if(op_2==0) {
                                    break;
                                }
                                else{
                                    System.out.println("wrong input");
                                }
                            }
                            director.Construct(pc3);
                            // System.out.println(director.getPC().getTotal());
                            director.Print_ram_gc();
                            //gaming.build();
                        }
                        order++;

                    }
                }
            }
        }
    }
}
