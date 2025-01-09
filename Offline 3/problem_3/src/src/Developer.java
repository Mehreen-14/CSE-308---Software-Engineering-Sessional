package src;

public class Developer implements Employee{
    private String dev_name;
    private String dev_project;

    public Developer(String name,String project){
        //this.dev_id = id;
        this.dev_name = name;
        this.dev_project = project;
    }

    @Override
    public void showDetails() {

        System.out.println(this.dev_name);
        System.out.println(this.dev_project);
    }

    @Override
    public void hierarchy() {
        System.out.println("-"+this.dev_name);
    }

    @Override
    public void removeAllEmployee() {

    }

    @Override
    public String getName() {
        return this.dev_name;
    }

    @Override
    public String getProject() {
        return dev_project;
    }

    @Override
    public void addEmployee(Employee e) {

    }

    @Override
    public void removeEmployee(Employee e) {

    }
}
