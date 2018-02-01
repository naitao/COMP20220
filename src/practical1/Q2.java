package practical1;

public class Q2 {
	public static void main(String args[]) {
		// Read subtotal and rate
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();

		// Perform calculations
		double gratuity = subtotal * rate / 100;
		double total = subtotal + gratuity;

		// Display results
		System.out.println("The gratuity is $" + gratuity + " total is $" + total);
	}
}
