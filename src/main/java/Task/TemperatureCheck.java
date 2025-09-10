package Task;


public class TemperatureCheck {
    public static void main(String[] args) {
        int temperature = 35;

        if (temperature > 40) {
            System.out.println("It's Very Hot!");
        } else if (temperature > 30) {
            System.out.println("It's Warm.");
        } else if (temperature > 20) {
            System.out.println("It's Pleasant.");
        } else if (temperature > 10) {
            System.out.println("It's Cool.");
        } else {
            System.out.println("It's Cold!");
        }
    }
}
