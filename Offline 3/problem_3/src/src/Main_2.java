package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        List<Employee> companies = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name,role,project,op;
        while(true){
            System.out.println("Enter Company Name: ");
            name = input.nextLine();
            Company c1 = new Company(name);
            while (true){
                System.out.println("Add Project Manager?   Y/N");
                op = input.nextLine();
                if (op.equalsIgnoreCase("y")){
                    System.out.print("Name : ");
                    name = input.nextLine();
                    //System.out.print("Role : ");
                    //role = input.nextLine();
                    System.out.print("Project Name: ");
                    project = input.nextLine();
                    ProjectManager p1 = new ProjectManager(name,"Project Manager",project);
                    while(true){
                        System.out.println("Add Developers? Y/N");
                        op = input.nextLine();
                        if(op.equalsIgnoreCase("y")){
                            System.out.println("Enter Developer Name: ");
                            name = input.nextLine();
                            Developer d = new Developer(name,project);
                            p1.addEmployee(d);
                        }
                        else if(op.equalsIgnoreCase("n")){
                            //System.out.println("No developer added");
                            p1.showDetails();
                            break;
                        }

                        else{
                            System.out.println("Invalid");
                        }
                    }
                    c1.addEmployee(p1);
                    companies.add(c1);

                }
                else if(op.equalsIgnoreCase("n")){
                    break;
                }

                else{
                    System.out.println("Invalid");
                }
            }
            c1.hierarchy();


            System.out.println("Remove Company? Y/N");
            op = input.nextLine();
            if (op.equalsIgnoreCase("y")){
                name = input.nextLine();
                for (int i=0;i< companies.size();i++){
                    Employee e = companies.get(i);
                    if (e.getName().equalsIgnoreCase(name)){
                        e.removeAllEmployee();
                        companies.remove(e);
                        System.out.println("removed");
                        continue;
                    }
                    else {
                        System.out.println("Not Exist");
                        continue;
                    }
                }
            }
            else if (op.equalsIgnoreCase("n")){
                System.out.println("Not removed");
               // continue;
            }
            else {
                System.out.println("Invalid");
                continue;
            }


            op = input.nextLine();
            if(op.equalsIgnoreCase("ok")){
                // System.out.println();
                for (Employee e:companies){
                    e.hierarchy();
                }
                break;
            }
        }



    }
}
