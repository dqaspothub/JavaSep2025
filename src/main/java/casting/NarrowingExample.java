package casting;

public class NarrowingExample {

	public static void main(String[] args) {
		
		double price = 99.99d;
		
		int roundedPrice = (int) price; // double to int
		
		System.out.println("Rounded price: " + roundedPrice);

	}

}
