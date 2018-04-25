package C2;
import java.util.Scanner;


public class ComputeArea{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input radius:");
		double radius = input.nextDouble();
		double area = Math.PI * radius * radius;
		//System.out.format("The area of circle is: %f", area);
		System.out.print("The area of circle is: " + area);
	}
}