package C7;
import java.util.Scanner;

public class AnalyzeNumbers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the number : ");
		int number = input.nextInt();
		int[] group = new int[number];
		int sum = 0;
		for (int i = 0; i<number; i++) {
			group[i] = input.nextInt();
			sum += group[i];
		}
		float average = sum/number;
		System.out.println("The average is: " + average);
		
		int count = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] >= average)
				count += 1;
		}
		System.out.println("There are " + count + " numbers above average");
	}
}