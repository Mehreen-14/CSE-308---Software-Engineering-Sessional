package src;//import java.lang.management.ManagementPermission;
//import java.util.*;
//
//public class Client {
//    public static void main(String[] args) {
//        Map<String,Employee> employeeMap = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        int op;
//        String name,project,in,man_name,dev_name;
//
//        while (true) {
//            System.out.println("ADD");
//            System.out.println("1.Company");
//            System.out.println("2.Manager");
//            System.out.println("3.Developer");
//            op = input.nextInt();
//            if (op == 1) {
//                System.out.println("Enter Company Name: ");
//                name = input.next();
//                if (employeeMap.size()==0){
//                    Company c1 = new Company(name);
//                    employeeMap.put("Company", c1);
//                    continue;
//                }
//                else {
//                    for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
//                        if (entry.getKey().equalsIgnoreCase("Company") && entry.getValue().getName().equalsIgnoreCase(name)) {
//                            System.out.println("Exists");
//                        } else {
//                            Company c1 = new Company(name);
//                            employeeMap.put("Company", c1);
//                        }
//                    }
//                    continue;
//                }
//
//
//
//            } else if (op == 2) {
//                System.out.println("Do you want to add manager in a company? y/n");
//                input.nextLine();
//                in = input.nextLine();
//                if (in.equalsIgnoreCase("y")) {
//                    System.out.println("Enter Company Name: ");
//                    name = input.nextLine();
//                    System.out.println("Enter Manager Name:");
//                    man_name = input.nextLine();
//                    System.out.println("Enter Project Name:");
//                    project = input.nextLine();
//                    for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
//                        if (entry.getKey().equalsIgnoreCase("Company") && entry.getValue().getName().equalsIgnoreCase(name)) {
//                            ProjectManager p = new ProjectManager(man_name, "Project Manager", project);
//                            entry.getValue().addEmployee(p);
//                            employeeMap.put("Manager",p);
//                        } else {
//                            Company c1 = new Company(name);
//                            employeeMap.put("Company", c1);
//                            ProjectManager p = new ProjectManager(man_name, "Project Manager", project);
//                            c1.addEmployee(p);
//                            employeeMap.put("Manager",p);
//
//                        }
//                    }
//
//                } else if (in.equalsIgnoreCase("n")) {
//                    System.out.println("Unsuccessful Operation");
//                } else {
//                    System.out.println("Invalid");
//                }
//                continue;
//            }
//            else if (op==3){
////                System.out.println("Do you want to add developer under given manager? y/n");
////                input.nextLine();
////                in = input.nextLine();
////                if (in.equalsIgnoreCase("y")){
////                    System.out.println("Enter Manager Name");
////                    man_name = input.nextLine();
////                    for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
////                        if (entry.getKey().equalsIgnoreCase("Manager") && entry.getValue().getName().equalsIgnoreCase(man_name)){
////                            System.out.println("Enter Project Name");
////                            project=input.nextLine();
////                            if (entry.getValue().getProject().equalsIgnoreCase(project)){
////                                System.out.println("Enter Developer Name:");
////                                dev_name = input.nextLine();
////                                Developer d = new Developer(dev_name,project);
////                                entry.getValue().addEmployee(d);
////                                employeeMap.put("Developer",d);
////                            }
////
////                        }
////                        else {
////                            System.out.println("Enter Project Name:");
////                            project = input.nextLine();
////                            ProjectManager p = new ProjectManager(man_name,"Project Manager",project);
////                            employeeMap.put("Manager",p);
////                            System.out.println("Enter Developer Name:");
////                            dev_name = input.nextLine();
////
////                            Developer d = new Developer(dev_name,project);
////                            p.addEmployee(d);
////                            employeeMap.put("Developer",d);
////                        }
////
////                    }
////                }
////                else if (in.equalsIgnoreCase("n")){
////                    System.out.println("Unsuccessful Operation...........");
////                }
////                continue;
//
//
//                System.out.println("Do you want to add a developer in a company? y/n");
//                in=input.nextLine();
//                if (in.equalsIgnoreCase("y")) {
//                    System.out.println("Enter Company Name: ");
//                    name = input.nextLine();
//                    System.out.println("Enter Manager Name:");
//                    man_name = input.nextLine();
//                   // System.out.println("Enter Project Name:");
//                   // project = input.nextLine();
//                    for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
//                        if (entry.getKey().equalsIgnoreCase("Company") && entry.getValue().getName().equalsIgnoreCase(name)) {
////                            ProjectManager p = new ProjectManager(man_name, "Project Manager", project);
////                            entry.getValue().addEmployee(p);
////                            employeeMap.put("Manager",p);
//
//                        } else {
//                            Company c1 = new Company(name);
//                            employeeMap.put("Company", c1);
//                            ProjectManager p = new ProjectManager(man_name, "Project Manager", project);
//                            c1.addEmployee(p);
//                            employeeMap.put("Manager",p);
//
//                        }
//                    }
//
//                } else if (in.equalsIgnoreCase("n")) {
//                    System.out.println("Unsuccessful Operation");
//                } else {
//                    System.out.println("Invalid");
//                }
//                continue;
//            }
//            op=input.nextInt();
//            if (op==4){
//                for (Map.Entry<String,Employee> en:employeeMap.entrySet()){
//                    en.getValue().hierarchy();
//                }
//                break;
//            }
//        }
//
//    }
//}
