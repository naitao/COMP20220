package C3;
import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a year");
		int year = input.nextInt();
		if (year % 4 != 0)
			System.out.print(year + " is not a leap year!");
		else {
			if (year % 100 == 0 && year % 400 != 0)
				System.out.print(year + " is not a leap year!");
			else {
				System.out.print(year + " is a leap year!");
			}
		}
	}
}