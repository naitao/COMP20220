package test;
import java.util.Scanner;

public class test2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int number = input.nextInt();
		if (number % 3 == 0 && number % 2 == 0) {
			System.out.print(number + " is divisible by both 2 and 3\n");
		}
		if (number % 3 == 0 || number % 2 == 0 || (number % 3 == 0 && number % 2 == 0))
			System.out.print(number + " is divisible by 2 or 3 or both\n");
		if ((number % 2 == 0 || number % 3 == 0) && ! (number % 2 == 0 && number %3 == 0))
			System.out.print(number + " is divisible by 2 or 3 but not both\n");
	}
}