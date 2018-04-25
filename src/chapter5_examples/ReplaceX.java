/*
 * A program that reads a line of text from the console and replaces
 * every occurrence of the letter 'x' with the underscore character. 
 */

package chapter5_examples;

import java.util.Scanner;

public class ReplaceX {
	public static void main(String[] args) {
		// Read a line of text
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String s1 = input.nextLine();
		
		// Iterate over the characters in the string
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) { 
			if (s1.charAt(i) == 'x')
				s2 += '_';
			else
				s2 += s1.charAt(i);
		}
		
		// Display result
		System.out.println("The modified line of text is: " + s2);
	}
}
