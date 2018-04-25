package practical4_16212141;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number:");
		int num = input.nextInt();
		if (isPalindrome(num))
			System.out.println(num + " is Palindrom number");
		else
			System.out.println(num + " is NOT Palindrom number");
	}
	public static int reverse(int number) {
		int n = 0;
		do{
			n += number % 10;
			n *= 10;
			number = (int)(number/10);
				
		}while(number>0);	
		return n/10;
	}
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}