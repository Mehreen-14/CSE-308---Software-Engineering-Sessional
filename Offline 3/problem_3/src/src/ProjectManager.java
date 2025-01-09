package src;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Employee{
    private String man_name,role,project;
    private List<Employee> employees = new ArrayList<>();

    public ProjectManager(String name,String role,String project){
        this.man_name = name;
        this.role = role;
        this.project = project;
    }

    public String getName() {
        return man_name;
    }

    @Override
    public String getProject() {
        return project;
    }

    public void setMan_name(String man_name) {
        this.man_name = man_name;
    }

    public void showDetails() {
        System.out.println("Name : "+this.man_name);
        System.out.println("Role : "+this.role);
        System.out.println("Current Project: "+this.project);
        System.out.println("Number of Supervisees: "+employees.size());
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }


    @Override
    public void hierarchy() {
        System.out.println("- "+this.man_name+"("+this.project+")");
        for (Employee e: employees){
            System.out.print("\t\t");
            e.hierarchy();
        }
    }

    @Override
    public void removeAllEmployee() {
        employees.clear();
    }
}

