package variables;

public class AdditionProgram {
    // global or intsnace variable
     int num1 = 10;
     int num2 = 20;
     int result = num1+num2;
    static int marks = 100;

    // Local variable
    public void Add(){
        int num3 = 10;
        int num4 = 15;
        int sum = num3+num4;

        System.out.println("The addition of num3 and num4 " + sum);
    }
    public static void main(String[] args) {

        AdditionProgram obj = new AdditionProgram();
        obj.Add();
        System.out.println("The addition of two numbers " +obj.result);
        System.out.println("The num1 value " +obj.num1);

    }
}