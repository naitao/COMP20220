package practical3_16212141;
import java.util.Scanner;

public class Q5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a group of numbers:");
		int number = input.nextInt();
		int maxNumber = -1;
		int maxCount = 0;
		do {
			if (number > maxNumber)
			{
				maxNumber = number;
			    maxCount = 1;
			}
			else if (number == maxNumber)
				maxCount += 1;
			number = input.nextInt();
		} while (number != 0);
		System.out.print("The largest integer is " + 
				maxNumber + " and it occurs " + maxCount + " times.");
	}
}