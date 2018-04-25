package C6;
import java.util.Scanner;

public class TestReturnMethod{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int grade = -1;
		do {
			System.out.println("Please input a grade:");
			System.out.println("The grade level is: " + getGrade(grade));
			grade = input.nextInt();
		} while (grade != 0);
	}
	public static char getGrade(int grade) {
		if (grade > 0 && grade < 50)
			return 'F';
		else if (grade >= 50 && grade < 60)
			return 'E';
		else if (grade >= 60 && grade < 70)
			return 'D';
		else if (grade >= 70 && grade < 80)
			return 'C';
		else if (grade >= 80 && grade < 90)
			return 'B';
		else if (grade >= 90 && grade <= 100)
			return 'A';
		else
			return '?';	
		}
}