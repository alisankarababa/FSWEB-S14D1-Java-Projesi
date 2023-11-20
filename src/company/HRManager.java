package company;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HRManager started working");
        setSalary(getSalary() + 1);
    }

    private boolean isIndexOutOfBounds(int idx, int arrLen) {
        return !( 0 <= idx && idx < arrLen );
    }

    private void guardIdxBound(int idx, int arrLen) {
        if( isIndexOutOfBounds(idx, arrLen)) {
            System.out.println("index out of bounds");
            return;
        }
    }


    public void addEmployee(JuniorDeveloper juniorDeveloper, int idx) {

        if(null == juniorDeveloper) {
            System.out.println("Developer cannot be null.");
            return;
        }

        if(isIndexOutOfBounds(idx, juniorDevelopers.length)) {
            System.out.println("Index: " + idx + " is out of bounds.");
            return;
        }

        if(null != juniorDevelopers[idx]) {
            System.out.println("Index: " + idx + " is not empty.");
        }

        if(Arrays.asList(juniorDevelopers).contains(juniorDeveloper)) {
            System.out.println(juniorDeveloper.getName() + " is already employed in this company.");
        }

        juniorDevelopers[idx] = juniorDeveloper;

    }

    public void addEmployee(MidDeveloper midDeveloper, int idx) {
        if(null == midDeveloper) {
            System.out.println("Developer cannot be null.");
            return;
        }

        if(isIndexOutOfBounds(idx, midDevelopers.length)) {
            System.out.println("Index: " + idx + " is out of bounds.");
            return;
        }

        if(null != midDevelopers[idx]) {
            System.out.println("Index: " + idx + " is not empty.");
        }

        if(Arrays.asList(midDevelopers).contains(midDeveloper)) {
            System.out.println(midDeveloper.getName() + " is already employed in this company.");
        }

        midDevelopers[idx] = midDeveloper;

    }
    public void addEmployee(SeniorDeveloper seniorDeveloper, int idx) {
        if(null == seniorDeveloper) {
            System.out.println("Developer cannot be null.");
            return;
        }

        if(isIndexOutOfBounds(idx, seniorDevelopers.length)) {
            System.out.println("Index: " + idx + " is out of bounds.");
            return;
        }

        if(null != seniorDevelopers[idx]) {
            System.out.println("Index: " + idx + " is not empty.");
        }

        if(Arrays.asList(seniorDevelopers).contains(seniorDeveloper)) {
            System.out.println(seniorDeveloper.getName() + " is already employed in this company.");
        }

        seniorDevelopers[idx] = seniorDeveloper;

    }

}
