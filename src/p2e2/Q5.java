package p2e2;
import java.util.Scanner;

public class Q5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a poinst with x and y:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		
		/*condition for in the area*/
		if (x>-5 && x < 5 && y > -2.5 && y < 2.5)
			System.out.print("The point is in the rect");
		else {
			/*condition for on the edge*/
			if (x == -5 || x == 5) {
				if (y <= 2.5 && y >= -2.5)
					System.out.print("The point is on the edge of this rect");
				else
					System.out.print("This point is out of this rect");
			}
			else if (y == 2.5 || y == -2.5) {
				if (x <= 5 && x >= -5)
					System.out.print("The point is on the edge of this rect");
				else
					System.out.print("The point is out of this rect");
			}
			else
				System.out.print("The point is out of this rect!");
		}
	}
}