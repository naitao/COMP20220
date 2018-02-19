/*
 * A program that uses the RadomCharacter class to print randomly generated lowercase letter characters.
 */

package chapter6_examples;

public class TestRandomCharacter1 {
	// Main method
	public static void main(String args[]) {
		// Keep printing randomly generated lowercase characters 
		// until the character generated is 'q'
		
		do {
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			if (ch == 'q')
				break;
			else
				System.out.print(ch);
		} while(true);
	}
}
