package test;
import java.util.Scanner;

public class test3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a year:");
		int year = input.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.print(year + " is a leap year");
		else
			System.out.print(year + " is NOT a leap year");
				
	}
}