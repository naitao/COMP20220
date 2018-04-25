package pp4;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number: ");
		String num = input.next();
		if (isPalindrome(num))
			System.out.println(num + " is Palidrome!");
		else
			System.out.println(num + " is NOT Palidrome!");
	}
	public static boolean isPalindrome(String num) {
		
		for (int i = 0; i < (int)(num.length()/2); i++) {
			if (!Character.isDigit(num.charAt(i)))
					return false;
			if (num.charAt(i) != num.charAt(num.length()-1-i))
					return false;
		}
		return true;
	}
}