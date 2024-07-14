package practiceques;

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students(1,"Asrim",3.8);
        Students s2 = new Students(2, "Lionel", 3.95);
        s1.printProfile();
        s2.printProfile();
    }
}
/*Create a Student class to simulate a student's profile. The class should have the
following attributes: student ID, name, and GPA. Include methods to updateGPA() and
printProfile(). Implement functionality to create new student profiles, update GPAs, and
print student profiles. */
    
class Students{
    private int studentID;
    private String name;
    private double gpa;

    public Students(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }
    public void printProfile() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Name: " + this.name);
        System.out.println("GPA: " + this.gpa);
    }
}