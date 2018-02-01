package  test2;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number between 0 to 999:");
		int number = input.nextInt();
		int digits = 0;
		while (number > 0) {
			digits += number % 10;
			number = number/10;
			}
		System.out.println("The sum of digits is: " + digits);
		}
}