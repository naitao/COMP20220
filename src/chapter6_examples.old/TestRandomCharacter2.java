/*
 * A program that uses the RadomCharacter class to print randomly generated Unicode characters.
 */

package chapter6_examples;

public class TestRandomCharacter2 {
	// Main method
	public static void main(String args[]) {
		// Print 20 randomly generated Unicode characters 

		for (int i = 0; i < 20; i++) {
			char ch = RandomCharacter.getRandomCharacter();
			System.out.print(ch);
		}
	}
}
