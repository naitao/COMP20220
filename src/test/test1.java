package test;
import java.util.Scanner;
public class test1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num = 1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		final double EPSILON = 1E-14;
		if (Math.abs(num-0.5) < EPSILON) {
			System.out.print(num + " is approximate 0.5\n");
		}
		else
			System.out.print(num);
		System.out.print("Please input a number:");
		int N = input.nextInt();
		/*
		if (N % 2 == 0)
			System.out.print("This is an even numer");
		else
			System.out.print("This is an odd number");
		 */
		boolean even = N % 2 == 0;
		if (even)
			System.out.print("It is " + even);
		else
			System.out.print("It is " + even);
			
	}
}