package C3;
import java.util.Scanner;

public class SubtractionTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 2 numbers:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		System.out.format("Please input the result of (%f - %f): ", n1, n2);
		double result = input.nextDouble();
		
		if (result == n1-n2)
			System.out.println("Your anwser is correct!");
		else
			System.out.println("Your anwser is not correct!");
	}
}