package Task;


public class ArithmeticOperations {
    int num1 = 9, num2 = 10;

    void performOperations() {
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
    }

    public static void main(String[] args) {
        ArithmeticOperations obj = new ArithmeticOperations();
        obj.performOperations();
    }
}
