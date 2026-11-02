
/*
  Name: Rushell E. Español
  Section: BSIT-2B
  Date: November 2, 2026
 */

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
            "Ana Cruz", "STU001", "BSIT", 2
        );

        Student student2 = new Student(
            "Mark Reyes", "STU002", "BSCS", 1
        );

        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3, "Full Scholar"
        );


        System.out.println("===== STUDENT INFORMATION =====");

        student1.displayInfo();
        System.out.println();

        student2.displayInfo();
        System.out.println();

        System.out.println("===== COLLEGE STUDENT =====");

        student3.displayInfo();
        System.out.println();

        System.out.println("===== UPDATED INFORMATION =====");

        student1.setYearLevel(4);

        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());

    }
}

/*
 REFLECTION QUESTIONS

 1. Why should the attributes of Student be private instead of public?
 
  Answer: The attributes should be private to keep student information
  protected. Other classes can still access or change them using
  getters and setters, but in a more controlled way.
 
  2. What would happen if CollegeStudent did not call super(...)
     in its constructor?
 
  Answer: The program would have a compilation error because the
  parent class doesn't have a default constructor. That's why
  CollegeStudent needs to call the required parent constructor
  using super(...).
 
  3. What is the benefit of overriding displayInfo() instead of
     writing a new method with a different name?
 
  Answer: Overriding lets CollegeStudent use the existing
  displayInfo() method from its parent class and add its own
  scholarship information. This also avoids writing the same
  code again.
 */