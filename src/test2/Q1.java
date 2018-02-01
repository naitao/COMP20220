package test2;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a radius:");
		double radius = input.nextDouble();
		System.out.println("Please input length of a cylinder");
		double length = input.nextDouble();
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;
		System.out.println("The area is:" + area);
		System.out.println("The volume is:" + volume);
	}
}