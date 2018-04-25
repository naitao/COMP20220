package practical4_16212141;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a password:");
		String passwd = input.nextLine();
		if (isValidPassword(passwd))
			System.out.print("'" + passwd + "' is valid password");
		else
			System.out.print("'" + passwd + "' is invalid password!");
	}
		
	public static boolean isValidPassword(String p) {
		return (hasValidLength(p) && containsLettersDigits(p) && satisfiesCountCheck(p));
	}
	public static boolean hasValidLength(String p) {
		return (p.length() >= 8);
	}
	public static boolean containsLettersDigits(String p) {
		int otherNum = 0;
		for (int i=0; i < p.length(); i++) {
			if (Character.isLowerCase(p.charAt(i)) == true)
				continue;
			else if (Character.isUpperCase(p.charAt(i)) == true)
				continue;
			else if (Character.isDigit(p.charAt(i)) == true)
				continue;
			else
				otherNum += 1;
		}
		return (otherNum == 0);
	}
	public static boolean satisfiesCountCheck(String p) {
		int digitNum = 0;
		int lowerNum = 0;
		for (int i=0; i < p.length(); i++) {
			if (Character.isLowerCase(p.charAt(i)) == true)
				lowerNum += 1;
			else if (Character.isDigit(p.charAt(i)) == true)
				digitNum += 1;
		}
		return ((digitNum >= 2) && (lowerNum >= 1));
	}

}