package practical1_16212141;

import java.util.Scanner;
import java.lang.Math;

public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double r = input.nextDouble();
		System.out.println("Enter the lengh of cylinder:");
		double l = input.nextDouble();
		double area = Math.pow(r,2) * Math.PI;
		double volume = area * l;
		System.out.println("The area is :" + area);
		System.out.println("The volume is:" + volume);
		
	}
}