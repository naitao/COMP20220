package test5;
import java.util.Scanner;

public class TestMax{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input 2 nubmers:");
		double i = input.nextDouble();
		double j = input.nextDouble();
		double maxNum = max(i, j);
		
		System.out.print("The max number is: " + maxNum);
		for (int n = 0; n < 10; n++) {
			double t = Math.random() * 0.5;
			System.out.println(t);
		}
	}
	
	public static double max(double a, double b) {
		if (a > b)
			return a;
		else
			return b;
	}
}