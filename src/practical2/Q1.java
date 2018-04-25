package practical2;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		// Declare the constant EPSILON
		final double EPSILON = 1E-14;
		
		// Read values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Check that a is not equal to zero
		if (Math.abs(a - 0) < EPSILON)
			System.out.println("a must be non-zero");
		else {
			// Calculate the discriminant
			double discriminant = Math.pow(b, 2) - 4 * a * c;

			// Test the value of the discriminant and display results
			if (discriminant < 0)
				System.out.println("The equation has no real roots");
			else if (discriminant > 0) {
				double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
				double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
				System.out.println("The equation has two roots " + r1 + " and " + r2);
			} else {
				double r = -b / (2 * a);
				System.out.println("The equation has one root " + r);
			}
		}
	}
}
