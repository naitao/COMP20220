package practical2;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		// Read a letter
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a lowercase or uppercase letter: ");
		char letter = input.next().charAt(0);

		// Check that the input is either a lowercase or uppercase letter
		if (Character.isLowerCase(letter) || Character.isUpperCase(letter)) {
			// Check if the letter is a vowel; first convert to lowercase
			char ch = Character.toLowerCase(letter);
			boolean isVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
			
			// Display results
			System.out.println(letter + " is a " + (isVowel ? "vowel" : "consonant"));
		} else
			System.out.println(letter + " is an invalid input");
	}
}
