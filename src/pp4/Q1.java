package pp4;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a password:");
		String password = input.nextLine();
		if (checkLength(password) && checkContent(password) && checkCharacter(password))
			System.out.println("'" + password + "' is a valid password");
		else
			System.out.println("It is not a valid password!");
	}
	
	public static boolean checkLength(String password) {
		return (password.length() >= 8);
	}
	
	public static boolean checkCharacter(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLowerCase(password.charAt(i)) && Character.isUpperCase(password.charAt(i)) && Character.isDigit(password.charAt(i)))
				return false;
		}
		return true;
	}
	public static boolean checkContent(String password) {
		int digitNum = 0;
		int lowerCaseNum = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i)))
				lowerCaseNum += 1;
			if (Character.isDigit(password.charAt(i)))
				digitNum += 1;
		}
		return (digitNum >= 2 && lowerCaseNum >= 1);
	}
}