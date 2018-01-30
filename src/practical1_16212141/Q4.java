package practical1_16212141;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the number of years:");
		int years = input.nextInt();
		int seconds = years * 365 * 24 * 60 * 60;
		double birthNum = seconds / 7;
		double deathNum = seconds / 13;
		double immigrantNum = seconds / 45;	
		int newPopulation = (int)(312032486 + birthNum - deathNum + immigrantNum);
		System.out.println("The new population after " + years + " years is " + newPopulation);
	}
}