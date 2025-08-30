package variables;

 class Employee {
    static String company = "OpenAI"; // static variable
    String name;
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";

        Employee e2 = new Employee();
        e2.name = "Bob";

        System.out.println(e1.name + " works at " + Employee.company);
        System.out.println(e2.name + " works at " + Employee.company);
    }
}
