/*
  Name: Rushell E. Español
  Section: BSIT-2B
  Date: November 2, 2026
 */

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String employeeId,
                   String department, double monthlySalary,
                   int teamSize) {

        super(name, employeeId, department, monthlySalary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}