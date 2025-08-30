package datatypes;

public class PrimitiveExample {
    public static void main(String[] args) {
        byte age = 25;                // small integer
        short year = 2025;            // short integer
        int population = 100000;      // normal integer
        long distance = 123456789L;   // large integer, notice 'L'

        float pi = 3.14f;             // decimal with 'f'
        double price = 99.99;         // high precision decimal

        char grade = 'A';             // single character
        boolean isJavaFun = true;     // true or false

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Pi: " + pi);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
