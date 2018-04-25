package C6;
import java.util.Scanner;

public class TestMax{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input two numbers:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		System.out.println("The max one is: " + max(n1, n2));
	}
	public static double max(double n1, double n2) {
		return (n1 > n2) ? n1 : n2; 
	}
}