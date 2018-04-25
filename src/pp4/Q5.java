package pp4;
import java.util.Scanner;

public class Q5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int num = input.nextInt();
		if (isPalindrame(num))
			System.out.println(num + " is Palindrame!");
		else
			System.out.println(num + " is not Palindrame!");
	}
	
	public static int reverse(int number) {
		int newNum = 0;
		while (number > 0) {
			newNum = newNum * 10 + number % 10;
			number = number/10;
		}
		return newNum;
	}
	
	public static boolean isPalindrame(int num) {
		return reverse(num) == num;
	}
}