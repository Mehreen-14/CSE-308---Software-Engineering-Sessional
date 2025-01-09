package src;

import java.util.ArrayList;
import java.util.List;

public class Company implements Employee{
    private String com_name;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name){
        this.com_name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Company");
        System.out.println(this.com_name);
        System.out.println("Project Managers");
        for (Employee e:employees){
            e.showDetails();
        }
    }

    @Override
    public void hierarchy() {
        System.out.println("- "+this.com_name);
        for (Employee e:employees){
            System.out.print("\t");
            e.hierarchy();
        }
    }

    @Override
    public void removeAllEmployee() {
        employees.clear();
    }

    @Override
    public String getName() {
        return com_name;
    }

    @Override
    public String getProject() {
        return null;
    }
}

