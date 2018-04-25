package practical5_16212141;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number of integers seperated by ONE space character:");
		String numStr = input.nextLine();
		if (numStr.length() == 0)
			// This condition is considered if user inputs nothing (Space character)
			System.out.print("[] Is Sorted!");
		else {
			String[] numStrArray = numStr.split(" ");
			int[] numArray = new int[numStrArray.length];
			// Convert digit Strings to integers and print them in sequence
			for (int i=0; i< numStrArray.length; i++)
			{
				numArray[i] = Integer.parseInt(numStrArray[i]);
				System.out.print(numArray[i] + " ");
			}
		    // Check if array is sorted
			if (isSorted(numArray))
				System.out.print(" is Sorted!");
			else
				System.out.print(" is NOT Sorted!");
		}
	}
	public static boolean isSorted(int[] arr){
		for(int i = 1; i<arr.length; i++) {
			if (arr[i] < arr[i-1])
				return false;
		}
		return true;
	}
}
