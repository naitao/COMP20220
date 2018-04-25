package C6;
import java.util.Scanner;

public class TestMethodOverloading{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input integer n1 and n2 :");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("max one is:" + max(n1, n2));
		
		System.out.print("Please input double n1 and n2: ");
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		System.out.println("max one is: " + max(n3,n4));
		
		System.out.print("Please input double n1, n2 and n3:");
		n3 = input.nextDouble();
		n4 = input.nextDouble();
		double n5 = input.nextDouble();
		System.out.println("max one is: " + max(n3, n4, n5));
	}
	public static int max(int n1, int n2) {
		return n1 > n2 ? n1:n2;
	}
	public static double max(double n1, double n2) {
		return n1 > n2 ? n1:n2;
	}
	public static double max(double n1, double n2, double n3) {
		double max = n1 > n2 ? n1: n2;
		return max > n3 ? max: n3;
	}
}