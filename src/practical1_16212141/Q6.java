package practical1_16212141;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input x1, y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Please input x2, y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		System.out.print("The distance is " + distance);
	}
}