package Task;

public class Student {
    // Instance variables
    String name;
    int rollNo;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.rollNo = 101;

        System.out.println("Student Name: " + student1.name);
        System.out.println("Roll Number: " + student1.rollNo);
    }
}
