/*
 * A program to demonstrate method overloading.
 */

package chapter6_examples;

public class TestMethodOverloading {
	// main method
	public static void main(String[] args) {
		// Invoke method max with int parameters
		int n1 = 3, n2 = 4;
		System.out.println("The max value is " + max(n1, n2));

		// Invoke method max with double parameters
		double d1 = 3.0; double d2 = 5.4;
		System.out.println("The max value is " + max(d1, d2));

		// Invoke method max with three double parameters
		double d3 = 10.14;
		System.out.println("The max value is "+ max(d1, d2, d3));
	}

	// Return the max of two int values
	public static int max(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}

	// Return the max of double values
	public static double max(double num1, double num2) {
		return (num1 > num2) ? num1 : num2;
	}

	// Return the max of three double values
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
}
