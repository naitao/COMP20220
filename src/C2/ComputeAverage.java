package C2;
import java.util.Scanner;

public class ComputeAverage{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input 3 numbers:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		System.out.print("The average of these 3 double is: " + (n1+n2+n3)/2);
	}
	
}