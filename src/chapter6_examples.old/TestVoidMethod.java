/*
 * A program to illustrate a method that does not return a value.
 * The method printGrade prints the letter grade corresponding to a score.
 */

package chapter6_examples;

public class TestVoidMethod {
	public static void main(String[] args) {
		// main method
		double score1 = 78.5;
		System.out.print("The grade is ");
		printGrade(score1); // Invoke method printGrade

		double score2 = 59.5;
		System.out.print("The grade is ");
		printGrade(score2); // Invoke method printGrade
	}

	// A method that prints the grade corresponding to a score
	public static void printGrade(double score) {
		if (score >= 90.0)
			System.out.println('A');
		else if (score >= 80.0)
			System.out.println('B');
		else if (score >= 70.0)
			System.out.println('C');
		else if (score >= 60.0)
			System.out.println('D');
		else
			System.out.println('F');
	}
}
