package practical1_16212141;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an integer between 0 and 999:");
		int number = input.nextInt();
		int digits = 0;
		while (number > 0) {
			digits += number % 10;
			number = number / 10;
		}
		System.out.println("The sum of all its digits is: " + digits);
	}
}