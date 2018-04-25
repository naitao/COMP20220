package C3;
import java.util.Scanner;

public class ComputeArea{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		if (radius <= 0)
			System.out.println("Please input a valid radius!");
		else
			System.out.println("The area of circle is: " + Math.PI * Math.pow(radius,  2));
	}
}