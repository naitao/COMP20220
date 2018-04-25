package practical2_16212141;
import java.util.Scanner;

public class Q6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an UniCode number in decimal:");
		int number = input.nextInt();
		if (number < 0 | number > 65535)
		{
			System.out.print("It is not valid code: " + number);
			System.exit(1);
		}
		String hexNum = Integer.toHexString(number);
		String s = "\\u"+hexNum;
/*
		char c = (char) Integer.parseInt(s.substring(2), 16);
*/
		char c = (char)number;
		System.out.print("The Hex unicode of this character is: '" + s + "'\n");
		System.out.print("The character is: '" + c + "'");
		
		System.out.print("\nPlease input a charater:");
		char ch = input.next().charAt(0);
		
		String Hex = Integer.toHexString(ch);
		System.out.print("The Hex number of this charater is:" + Hex);	
		int newNumber = Integer.parseInt(Hex, 16);
		System.out.print("\nThe decimal number of this charater is:" + newNumber);	
	}
}