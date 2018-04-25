package C5;
import java.util.Scanner;

public class SentinelValue{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a group of numbers:");
		int value = input.nextInt();
		int sum = 0;
		while(value != 0) {
			sum += value;
			System.out.println("please input a group of numbers:");
			value = input.nextInt();
		}
		System.out.print("Sum is : " + sum);
	}
}