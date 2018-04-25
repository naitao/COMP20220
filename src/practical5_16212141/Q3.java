package practical5_16212141;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number of integers seperated by ONE space character:");
		String numStr = input.nextLine();
		if (numStr.length() == 0)
			// This condition is considered if user inputs nothing (Space character)
			System.out.print("[] does NOT contain four consecutive integers!");
		else {
			String[] numStrArray = numStr.split(" ");
			int[] numArray = new int[numStrArray.length];
			// Convert digit Strings to integers and print them out in sequence
			for (int i=0; i< numStrArray.length; i++)
			{
				numArray[i] = Integer.parseInt(numStrArray[i]);
				System.out.print(numArray[i] + " ");
			}
		    // Check if the integer array contains four consecutive integers
			if (isConsecutiveFour(numArray))
				System.out.print(" contains four consecutive integers!");
			else
				System.out.print(" does NOT contain four consecutive integers!");
		}
	}
	public static boolean isConsecutiveFour(int[] values) {
		int count = 1;
		for (int i = 0; i < values.length-1; i++) {
			if (values[i] == values[i+1])
				count += 1;
			else
				count = 1;
		
			if (count == 4)
				break;
		}
		return count >= 4;
	}
}
