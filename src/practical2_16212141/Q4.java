package practical2_16212141;
import java.util.Scanner;

public class Q4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the lenth from the center of a pentagon to a vertex(r):");
		double r = input.nextDouble();
		if (r<0) {
			System.out.print("Please input the valid value for lenth");
			System.exit(1);
		}
		else {
			double s = 2 * r * Math.sin(Math.PI/5); 
			double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI/5));
			System.out.print("Results is: " + area);
		}
	}
}