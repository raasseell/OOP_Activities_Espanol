/*
  Name: Rushell E. Español
  Section: BSIT-2B
  Date: November 2, 2026
 */

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(
            "Juan Dela Cruz", "EMP001", "IT", 25000.0
        );

        Employee emp2 = new Employee(
            "Maria Lopez", "EMP002", "HR", 22000.0
        );

        Manager emp3 = new Manager(
            "Carlo Mendoza", "EMP003", "IT", 45000.0, 8
        );

        System.out.println("===== EMPLOYEE INFORMATION =====");
        emp1.displayInfo();
        System.out.println();

        emp2.displayInfo();
        System.out.println();

        System.out.println("===== MANAGER =====");
        emp3.displayInfo();
        System.out.println();

        emp2.setMonthlySalary(24000.0);

        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Monthly Salary: " + emp2.getMonthlySalary());
    }
}

/*
  REFLECTION QUESTIONS
 
  1. Why should monthlySalary be private, and what does the setter
     protect against?
 
  Answer: The monthlySalary attribute should be private to maintain
  the confidentiality of the employee's salary information.
  The setter also ensures that invalid values, such as zero or
  negative amounts, cannot be assigned.
 
  2. Is a Manager also an Employee? Explain using the word extends.
 
  Answer: Yes. Manager extends Employee, which means it inherits
  the attributes and methods of the Employee class. Therefore,
  Manager is a subclass of Employee and represents a specific
  type of employee.
 
  3. What is the advantage of calling super.displayInfo() inside
     Manager's displayInfo()?
 
  Answer: Calling super.displayInfo() allows Manager to reuse
  the existing method from the Employee class. It displays the
  employee's basic information first before adding the manager's
  additional information, such as team size.
 */