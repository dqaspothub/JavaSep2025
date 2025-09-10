package Task;


public class TypeCastingDemo {
    int smallNumber;
    double bigNumber;

    public static void main(String[] args) {
        TypeCastingDemo obj = new TypeCastingDemo();
        obj.bigNumber = 123.45;

        // Explicit type casting (narrowing)
        obj.smallNumber = (int) obj.bigNumber;

        System.out.println("Big Number (double): " + obj.bigNumber);
        System.out.println("Small Number (int after casting): " + obj.smallNumber);
    }
}
