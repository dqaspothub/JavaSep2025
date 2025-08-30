package variables;

class Person {
    String name; // instance variable
    int age;     // instance variable
}

public class InstanceVariableExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 30;

        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 25;

        System.out.println(p1.name + " is " + p1.age); // Alice is 30
        System.out.println(p2.name + " is " + p2.age); // Bob is 25
    }
}
