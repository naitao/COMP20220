package practical2_16212141;
import java.util.Scanner;
public class Q2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 3 lengths for a, b, c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a+b < c | a+c < b | b+c < a) {
			System.out.println("Please input the valid lengths for triangle");
			System.exit(1);
		}
		else
			System.out.println("The perimeter is: " + (a+b+c));
	}
}