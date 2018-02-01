package practical1_16212141;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please input pounds of weight:");
		double weight = input.nextDouble();
		System.out.print("Please input the inch of height:");
		double height = input.nextDouble();
		double BMI = 0.45359237 * weight / Math.pow(0.0254 * height, 2);
		System.out.println("BMI: " + BMI);
	}
}