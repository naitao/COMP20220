package practical1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		// Read weight in pounds and height in inches
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		// Perform calculation
		double bmi = weight * 0.45359237 / Math.pow(height * 0.0254, 2);

		// Dosplay results
		System.out.print("BMI for weight " + weight + " and height " + height + " is " + bmi);
	}
}