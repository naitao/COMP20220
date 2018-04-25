/*
 *  A program that prompts the user to guess a number repeatedly until the number 
 *  matches a target number. The target number is a randomly generated integer 
 *  between 0 and 100, inclusive. 
 *  
 *  For each user input, the program tells the user whether the guess is too low 
 *  or too high, so the user can choose the next guess intelligently. 
 */

package chapter5_examples;

import java.util.Scanner; 

public class GuessNumber {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Generate a random number to be guessed between 0 to 100, inclusive
		int target = (int)(Math.random() * 101); 

		// Declare variable to hold the user's guess
		int guess = -1; // Initialise to some value that will not equal target
		while (guess != target) {
			// Prompt the user to guess the number
			System.out.print("Enter your guess (between 0 and 100): ");
			guess = input.nextInt();
		
			// Compare guess to number
			if (guess == target)
				System.out.println("Yes, the number is " + target);
			else if (guess > target)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		} // End of loop
	}
}
