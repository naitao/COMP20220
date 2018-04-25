package p2e2;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input 3 lengths of a triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a+b > c && b+c > a && a+c > b)
			System.out.print("The perimeter of this triangle is: " + (a+b+c));
		else
			System.out.print("This is not a valid triangle, please input a,b and c again!");
	}
}