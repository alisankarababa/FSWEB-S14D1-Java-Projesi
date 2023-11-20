package company;

public class MidDeveloper extends Employee {

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper started working");
        setSalary(getSalary() + 1);
    }
}
