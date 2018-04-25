package practical2;

import java.util.Scanner;

public class Q6 {
	public static void main(String args[]) {
		// Read a Unicode value
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Unicode value (in decimal): ");
		int value = input.nextInt();

		// (a) Check the value is valid and display results
		if (value >= 0 && value <= 65535)
			System.out.println("The character for Unicode " + value + " is '" + (char)value + "'");
		else
			System.out.println("Valid Unicodes are between 0 and 65,535 inclusive");

		// (b) Read a character and display its Unicode value (in decimal)
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);	    
		System.out.println("The Unicode for the character '" + ch + "' is " + (int)ch);
	}
}
