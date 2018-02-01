package practical1_16212141;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input distance on miles:");
		double distance = input.nextDouble();
		System.out.print("Please fuel efficiency on miles per gallon: ");
		double E = input.nextDouble();
		System.out.print("Please input the price per gallon:");
		double gallonPrice = input.nextDouble();
		double Total = (distance/E) * gallonPrice;
		System.out.println("The total cost of this trip is: $" + Total);	
	}
}