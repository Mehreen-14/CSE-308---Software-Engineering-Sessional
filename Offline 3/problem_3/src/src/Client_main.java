package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option,in,flag = 0;
        String com_name,man_name,dev_name,project,y_n_op,name="unknown";
        Map<String,Employee> employeeMap = new HashMap<>();
        while (true){

            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Company Hierarchy");
            System.out.println("4.Show Details");
            System.out.println("5.Exit");
            option = input.nextInt();
            if (option==1){
                System.out.println("1.Company");
                System.out.println("2.Project Manager");
                System.out.println("3.Developer");
                System.out.println("4.Exit");
                in = input.nextInt();
                if (in==1) {
                    System.out.println("Enter Company Name");
                    input.nextLine();
                    com_name = input.nextLine();
                    if (employeeMap.size() == 0) {
                        Company c1 = new Company(com_name);
                        employeeMap.put("Company", c1);
                        System.out.println("\n\n");
                        c1.hierarchy();
                        continue;
                    } else {
                        for (Map.Entry<String, Employee> entry : new HashMap<String, Employee>(employeeMap).entrySet()) {
                            if (entry.getKey().equalsIgnoreCase("Company") && entry.getValue().getName().equalsIgnoreCase(com_name)) {
                                name = com_name;
                            }
                            for (Map.Entry<String, Employee> entry1 : employeeMap.entrySet()) {
                                if (name.equalsIgnoreCase(com_name)) {
                                    System.out.println("Exists");
                                } else {
                                    Company c1 = new Company(com_name);
                                    employeeMap.put("Company", c1);
                                    System.out.println("\n\n");
                                    c1.hierarchy();
                                }
                            }
                            continue;
                        }


                    }
                }
                else if(in==2){
                    System.out.println("Enter Manager Name");
                    input.nextLine();
                    man_name = input.nextLine();
                    if (employeeMap.size()==0){
                        System.out.println(employeeMap.size());
                        System.out.println("Manager name not found");
                        System.out.println("Enter Company Name");
                        com_name = input.nextLine();
                        Company c = new Company(com_name);
                        employeeMap.put("Company",c);
                        System.out.println("Enter Project Name");
                        project = input.nextLine();
                        ProjectManager p = new ProjectManager(man_name,"Project Manager",project);
                        c.addEmployee(p);
                        employeeMap.put("Manager",p);

                        //System.out.println("\n\n");
                        c.hierarchy();
                        continue;
                    }

                    else{
                        System.out.println("size "+employeeMap.size());
                        for (Map.Entry<String, Employee> entry : new HashMap<String, Employee>(employeeMap).entrySet()) {
                            if (entry.getKey().equalsIgnoreCase("Manager") && entry.getValue().getName().equalsIgnoreCase(man_name)) {
                                name = man_name;
                            }
                        }
                        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                            //System.out.println(entry.getKey()+ " "+entry.getValue().getName());
                            if (name.equalsIgnoreCase(man_name)) {
                                 flag = 1;
                                //continue;
                            } else {
                                System.out.println("Manager Not Found");
                                System.out.println("Do you want to add this manager to a company? y/n");
                               // input.nextLine();




                                y_n_op=input.nextLine();
                                //input.nextLine();
                                System.out.println("pressed y");
                                if (y_n_op.equalsIgnoreCase("y")){
                                    System.out.println("pressed yes");
                                    //input.nextLine();
                                    System.out.println("Enter Company Name");
                                    //input.nextLine();
                                    com_name=input.nextLine();
                                    for (Map.Entry<String, Employee> entry1 : new HashMap<String, Employee>(employeeMap).entrySet()){
                                        if (entry.getKey().equalsIgnoreCase("Company") && entry.getValue().getName().equalsIgnoreCase(com_name)) {
                                            name = com_name;
                                        }
                                        }
                                    if (name.equalsIgnoreCase(com_name)) {
                                        System.out.println("Enter project name");
                                        project = input.nextLine();
                                        ProjectManager p = new ProjectManager(man_name,"Project Manager",project);
                                        employeeMap.put("Manager",p);
                                        entry.getValue().addEmployee(p);
                                        System.out.println(man_name+" added to "+com_name+" Company");
                                        System.out.println("\n\n");
                                        entry.getValue().hierarchy();
                                        break;
                                    }
                                    else{
                                        //System.out.println("Enter Company Name");
                                        //com_name = input.nextLine();
                                        Company c = new Company(com_name);
                                        employeeMap.put("Company",c);
                                        System.out.println("Enter Project Name");
                                        project = input.nextLine();
                                        ProjectManager p = new ProjectManager(man_name,"Project Manager",project);
                                        c.addEmployee(p);
                                        employeeMap.put("Manager",p);

                                        System.out.println(com_name+" added");
                                        System.out.println(man_name+" added to "+com_name+" Company");
                                       // System.out.println("\n\n");
                                        c.hierarchy();
                                        //continue;
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Manager add unsuccessful");
                                }
                            }
                        }
                        if (flag==1){
                            System.out.println("Exits");
                        }
                        continue;
                    }
                }
                else if(in==3){
                    input.nextLine();
                    System.out.println("Enter Developer Name");
                    //input.nextLine();
                    dev_name = input.nextLine();
                    if (employeeMap.size()==0){
                        System.out.println("Enter Company Name");
                        com_name=input.nextLine();
                        Company c = new Company(com_name);
                        System.out.println("Enter Manager Name");
                        man_name = input.nextLine();
                        System.out.println("Enter Project Name");
                        project = input.nextLine();
                        ProjectManager p = new ProjectManager(man_name,"Project Manager",project);
                        Developer d = new Developer(dev_name,project);
                        p.addEmployee(d);
                        c.addEmployee(p);

                        employeeMap.put("Company",c);
                        employeeMap.put("Manager",p);
                        employeeMap.put("Developer",d);

                        c.hierarchy();
                        continue;
                    }

                    else{
                        flag=0;
                        for (Map.Entry<String, Employee> entry : new HashMap<String, Employee>(employeeMap).entrySet()) {
                            if (entry.getKey().equalsIgnoreCase("Developer") && entry.getValue().getName().equalsIgnoreCase(dev_name)) {
                                //System.out.println("Exists");
                                name = dev_name;

                            }
                            System.out.println( employeeMap.size());

                                if (name.equalsIgnoreCase(dev_name)) {
                                    //System.out.println("Exists");
                                    flag = 1;

                                } else {
                                    System.out.println("Not found");
                                    System.out.println("Want to add under a manager? y/n");
                                    y_n_op = input.nextLine();
                                    if (y_n_op.equalsIgnoreCase("y")) {
                                        System.out.println("Enter Manager Name");
                                        man_name = input.nextLine();
                                        System.out.println("Enter Project name");
                                        project = input.nextLine();
                                        for (Map.Entry<String, Employee> entry2 : new HashMap<String, Employee>(employeeMap).entrySet()) {
                                            if (entry2.getKey().equalsIgnoreCase("Manager") && entry2.getValue().getName().equalsIgnoreCase(man_name)) {
                                                name = man_name;
                                            }
                                        }
                                        if (man_name.equalsIgnoreCase(name)) {
                                            Developer d = new Developer(dev_name, project);
                                            entry.getValue().addEmployee(d);
                                            employeeMap.put("Developer", d);
                                            System.out.println(dev_name + " added to " + man_name);
                                           // continue;
                                        } else {
                                            System.out.println("Manager Not Found");
                                            System.out.println("Enter Company Name");
                                            com_name = input.nextLine();
                                            for (Map.Entry<String, Employee> entry3 : new HashMap<String, Employee>(employeeMap).entrySet()) {
                                                if (entry3.getKey().equalsIgnoreCase("Company") && entry3.getValue().getName().equalsIgnoreCase(com_name)) {
                                                    name = com_name;
                                                }
                                            }
                                            if (name.equalsIgnoreCase(com_name)) {
//                                            Developer d = new Developer(dev_name,project);
//                                            entry.getValue().addEmployee(d);
//                                            employeeMap.put("Developer",d);
//                                            System.out.println(dev_name+" added to "+man_name);
                                                ProjectManager p = new ProjectManager(man_name, "Project Manager", project);
                                                Developer d = new Developer(dev_name, project);
                                                p.addEmployee(d);
                                                employeeMap.put("Developer", d);
                                                employeeMap.put("Manager", p);
                                                entry.getValue().addEmployee(p);
                                                entry.getValue().hierarchy();
                                            } else {
                                                Company c = new Company(com_name);
                                                ProjectManager p = new ProjectManager(man_name, "Project Manager", project);
                                                Developer d = new Developer(dev_name, project);
                                                p.addEmployee(d);
                                                c.addEmployee(p);
                                                employeeMap.put("Developer", d);
                                                employeeMap.put("Manager", p);
                                                employeeMap.put("Company", c);
                                                c.hierarchy();
                                                System.out.println("added " + c.getName());
                                                System.out.println("added " + p.getName());
                                                System.out.println("added " + d.getName());
                                            }

                                        }
                                        break;

                                    } else if (y_n_op.equalsIgnoreCase("n")) {
                                        System.out.println("Adding developer unsuccessful");

                                    }


                                }

                        }
                        if (flag==1){
                            System.out.println("Exists");
                        }
                    }


                }
                else if (in==4){
                    break;
                }
                else
                {
                    System.out.println("Invalid option....options from 1 to 4");
                }
            }
            else if (option==2){
                System.out.println("1.Company");
                System.out.println("2.Project Manager");
                System.out.println("3.Developer");
                System.out.println("4.Exit");
                in = input.nextInt();
                if (in==1){
                    flag=0;
                    System.out.println("Enter Company Name");
                    input.nextLine();
                    com_name = input.nextLine();
                    for (Map.Entry<String, Employee> ValMap :
                            new HashMap<String, Employee>(employeeMap).entrySet()) {
                        if (ValMap.getKey().equalsIgnoreCase("Company") && ValMap.getValue().getName().equalsIgnoreCase(com_name)){
                            ValMap.getValue().removeAllEmployee();
                            employeeMap.remove("Company",ValMap);
                            employeeMap.replace("Company",ValMap.getValue(),null);
                            System.out.println("removed "+com_name);
                        }
                        else if (ValMap.getValue()==null)
                        {
                            flag=1;
                        }

                    }
                    if (flag==1){
                        System.out.println("Not found");
                    }
                }
                else if(in==2){
                    flag=0;
                    //System.out.println("Enter Developer Name");
                   //
                   // dev_name = input.nextLine();
                    System.out.println("Enter Manager Name");
                     input.nextLine();
                    man_name = input.nextLine();
                    System.out.println("Enter Company Name");
                    // input.nextLine();
                    com_name = input.nextLine();
                    for (Map.Entry<String, Employee> ValMap :
                            new HashMap<String, Employee>(employeeMap).entrySet()) {
                        // System.out.println(keys.next()+ " "+employeeMap.get(keys.next()).getName());
                        //System.out.println(employeeMap);
                        if (ValMap.getKey().equalsIgnoreCase("Manager") && ValMap.getValue().getName().equalsIgnoreCase(man_name)) {
                            Employee temp_d;
                            temp_d = ValMap.getValue();
                            ValMap.getValue().removeAllEmployee();
                            System.out.println(temp_d.getName());

                            for (Map.Entry<String, Employee> map :
                                    new HashMap<String, Employee>(employeeMap).entrySet()) {
                                if (map.getKey().equalsIgnoreCase("Company") && map.getValue().getName().equalsIgnoreCase(com_name)) {

                                    System.out.println("deleted " + man_name);

                                    Employee temp_p;
                                    temp_p = ValMap.getValue();
                                    map.getValue().removeAllEmployee();
                                    employeeMap.remove("Manager", temp_d);

                                    continue;
                                    //System.out(null);

                                }
                            }
                        }
                        else {
                            //System.out.println("Not exist");
                            // flag=1;
                        }
                    }
                    if (flag==1){
                        System.out.println("Not found");
                    }


                }
                else if(in==3){
                    flag=0;
                    System.out.println("Enter Developer Name");
                    input.nextLine();
                    dev_name = input.nextLine();
                    System.out.println("Enter Manager Name");
                   // input.nextLine();
                    man_name = input.nextLine();
                    System.out.println("Enter Project Name");
                   // input.nextLine();
                    project = input.nextLine();
                    for (Map.Entry<String, Employee> ValMap :
                            new HashMap<String, Employee>(employeeMap).entrySet()) {
                       // System.out.println(keys.next()+ " "+employeeMap.get(keys.next()).getName());
                        //System.out.println(employeeMap);
                        if (ValMap.getKey().equalsIgnoreCase("Developer") && ValMap.getValue().getName().equalsIgnoreCase(dev_name)) {
                            Employee temp_d;
                            temp_d = ValMap.getValue();
                            System.out.println(temp_d.getName());

                            for (Map.Entry<String, Employee> map :
                                    new HashMap<String, Employee>(employeeMap).entrySet()) {
                                if (map.getKey().equalsIgnoreCase("Manager") && map.getValue().getName().equalsIgnoreCase(man_name)) {

                                    System.out.println("deleted " + dev_name);

                                    Employee temp_p;
                                    temp_p = ValMap.getValue();
                                    map.getValue().removeAllEmployee();
                                    employeeMap.remove("Developer", temp_d);

                                    continue;
                                    //System.out(null);

                                }
                            }
                        }
                        else {
                            //System.out.println("Not exist");
                           // flag=1;
                        }
                    }
                    if (flag==1){
                        System.out.println("Not found");
                    }


                }
                else if (in==4){
                    break;
                }
                else
                {
                    System.out.println("Invalid option....options from 1 to 4");
                }
            }
            else if(option==3){
                System.out.println("Enter Company Name");
                input.nextLine();
                int p=0;
                flag=0;
                com_name = input.nextLine();
                System.out.println("Show Company Details");
                for (Map.Entry<String, Employee> entry : new HashMap<String, Employee>(employeeMap).entrySet()) {
                    if (entry.getValue()==null){
                        //System.out.println("Not Exist");
                        p=1;
                    }
                   else if (entry.getKey().equalsIgnoreCase("Company") && entry.getValue().getName().equalsIgnoreCase(com_name)) {
                       // System.out.println("Exists");
                        flag=1;
                        entry.getValue().hierarchy();
                    }

                }

                if (flag==1){
                    System.out.println("exists");
                }
                else {
                    System.out.println("Not exist");
                }
            }
            else if(option==4){
                System.out.println("Enter Name");
                input.nextLine();
                flag=0;
                name = input.nextLine();
                for (Map.Entry<String, Employee> map :
                        new HashMap<String, Employee>(employeeMap).entrySet()) {
                    if (map.getValue().getName().equalsIgnoreCase(name)) {
                        flag=0;
                        map.getValue().showDetails();
                    }
                    else {
                        //System.out.println("Not Found");
                        flag=1;
                    }
                }
                if (flag==1){
                    System.out.println("Not found");
                }
            }
            else if(option==5){
                break;
            }
            else {
                System.out.println("Invalid option.....give your options from 1 to 3");
            }

        }

    }
}