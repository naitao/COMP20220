package test2;
import java.util.Scanner;

public class Q2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input subtotal:");
		double subtotal = input.nextDouble();
		System.out.println("Please input gratuity rate:");
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * gratuityRate / 100;
		System.out.println("The gratuity is : $" + gratuity);
		double total = subtotal + gratuity;
		System.out.println("The total is: $" + total);
	}
}