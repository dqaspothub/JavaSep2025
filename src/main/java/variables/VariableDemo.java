package variables;

public class VariableDemo {

    String name = "Kannathasan";
    int rollNumber = 10;
    double price = 10.00;

    static String course = "Core Java";  // static variable

    String trainerName = "Kannathasan";      // instance variable

    public void printDetails() {
        int duration = 60;  // local variable
        System.out.println("Course: " + course);
        System.out.println("Trainer: " + trainerName);
        System.out.println("Duration: " + duration + " days");
    }


    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.printDetails();

    }
}

