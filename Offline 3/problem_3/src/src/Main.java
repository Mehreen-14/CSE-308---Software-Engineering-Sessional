package src;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer("Robert Oppenheimer","abc");
        Developer d2 = new Developer("John von Neumann","ads");
        Developer d3 = new Developer("Alfred Aho","ase");

        ProjectManager p1 = new ProjectManager("Alan Turing","Project Manager","CSE308");
        ProjectManager p2 = new ProjectManager(" David Patterson","Project Manager","CSE307");

        p1.addEmployee(d1);
        p1.addEmployee(d2);
       // p1.showDetails();

        p2.addEmployee(d3);
       // p2.showDetails();


        Company c1 = new Company("Manhattan Company");
        c1.addEmployee(p1);
        c1.addEmployee(p2);
        c1.hierarchy();
    }
}


