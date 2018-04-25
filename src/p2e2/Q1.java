package p2e2;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a, b and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a == 0)
			System.out.print("a must not be zero!");
		else {
			double  discriminant = Math.pow(b, 2) - 4 * a * c;
			if (discriminant == 0)
			{
				System.out.print("There is only one root: " + (-b/(2 * a)));
			}
			else if (discriminant < 0)
			{
				System.out.print("The equation has no root");
			}
			else {
				double r1 = (-b + discriminant)/(2*a); 
				double r2 = (-b - discriminant)/(2*a);
				System.out.print("\nroot 1 of equation is: " + r1);
				System.out.print("\nroot 2 of equation is: " + r2);
			}
		}
	}
}