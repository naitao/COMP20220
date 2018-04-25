/*
 * A program to illustrate a method that returns a value.
 * The method getGrade returns the letter grade corresponding to a score.
 */

package chapter6_examples;

public class TestReturnMethod {
	// main method
	public static void main(String[] args) {
		double score1 = 78.5;
		char grade1 = getGrade(score1); // Invoke method getGrade
		System.out.println("The grade is " + grade1);
		
		double score2 = 59.5;
		char grade2 = getGrade(score2); // Invoke method getGrade
		System.out.println("The grade is " + grade2);
	}

	// A method that *returns* the grade corresponding to a score
	public static char getGrade(double score) {
		if (score >= 90.0)
			return 'A';
		else if (score >= 80.0)
			return 'B';
		else if (score >= 70.0)
			return 'C';
		else if (score >= 60.0)
			return 'D';
		else
			return 'F';
	}
}
