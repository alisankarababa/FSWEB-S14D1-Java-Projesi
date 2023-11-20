package company;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("JuniorDeveloper started working");
        setSalary(getSalary() + 1);
    }
}
