package practical1_16212141;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input outside temperature Ta <-58 or >41: ");
		double Ta = input.nextDouble();
		System.out.print("Please input wind speed V >= 2: ");
		double V = input.nextDouble();
		double T = 35.74 + (0.6215 * Ta) - (35.75 * Math.pow(V, 0.16)) + (0.4275 * Ta * Math.pow(V, 0.16));
		System.out.println("Wind-Chill temperature is :" + T);
	}
}