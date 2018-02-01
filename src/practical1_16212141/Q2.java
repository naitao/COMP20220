package practical1_16212141;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input subtotal:");
		double subtotal = input.nextDouble();
		System.out.println("Please input gratuity rate:");
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * gratuityRate / 100;
		double total = subtotal + gratuity;
		System.out.println("Gratuity is $" + gratuity);
		System.out.println("Total is $" + total);
	}
	}