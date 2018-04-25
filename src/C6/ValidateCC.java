package C6;
import java.util.Scanner;

public class ValidateCC{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a credit card number:");
		String num = input.nextLine();
		if (validNumber(num) && validPrefix(num) && Luhn(num))
			System.out.println("It is a valid credit card number!");
		else
			System.out.println("It is not a valid credit car number!");;
	}
	public static boolean validNumber(String num) {
		return (num.length() >= 13 && num.length() <= 16);
	}
	public static boolean validPrefix(String num) {
		if (num.charAt(0) == '4' || num.charAt(0) == '5' || num.charAt(0) == 6)
			return true;
		else if (num.charAt(0) == 3 && num.charAt(1) == 7)
			return true;
		else
			return false;
	}
	
	public static boolean Luhn(String num) {
		int sum = 0;
		for (int i = num.length()-1; i > 0; i=i-2) {
			sum += (int)(num.charAt(i) - '0') + (int)(num.charAt(i-1) - '0');
		}
		int sum2 = 0;
		for (int i = num.length()-2; i > 0; i = i-2) {
			sum2 += (int)(num.charAt(i) - '0') + (int)(num.charAt(i-1) - '0');
		}
		sum2 *= 2;
		int digits = sum2/10 + sum2 % 10;
		return (digits + sum) % 10 == 0;
	}
}