package p2e2;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an integer from 0 to 15: ");
		int n = input.nextInt();
		if (n < 0 || n > 15)
			System.out.print("Please input a valid integer between 0-15!");
		else
		{
			if (n<10)
				System.out.print("Hex number is: 0x0" + n);
			else {
				char ch = (char)('A' + n - 10);
				System.out.print("Hex number is : 0x0" + ch);
			}
		}
	}
}