/*
 * Alternative solution using break keyword.
 */

package practical3;

import java.util.Scanner;

public class Q5b {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Initialise max to 0 and count to 1
		int max = 0;
		int count = 1;

		do {
			// Prompt the user to enter an integer
			System.out.print("Enter an integer (0 ends the input): ");
			int number = input.nextInt();

			// Exit the loop if the user enters 0
			if (number == 0)
				break;

			// If number > max, set max to number and count to 1
			if (number > max) { 
				max = number;
				count = 1;
			} 
			// If number is equal to max, increment the count by 1
			else if (number == max) 
				count++;
		} while(true);

		// Display result
		if (max > 0) {
			System.out.println("The max number is: " + max);
			System.out.println("The count for the max number is: " + count);
		}
		else 
			System.out.println("No numbers are entered except 0");
	}
}
