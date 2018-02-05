package practical2_16212141;
import java.util.Scanner;

public class Q5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a point with x, y :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double higherY = 2.5;
		double lowerY = -2.5;
		double leftX = -5;
		double rightX = 5;
		
		if (x == leftX | x == rightX | y == higherY | y == lowerY)
			System.out.print("The point is on the edge of the rectangle");
		else {
			if (y < higherY & y > lowerY  & x > leftX & x < rightX)
				System.out.print("The point is in the rectangle");
			else
				System.out.print("The point is out of the rectangel");
		}
	}
}