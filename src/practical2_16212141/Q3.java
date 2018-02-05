package practical2_16212141;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a:");
		int a = input.nextInt();
		if (a < 0 | a > 15) {
			System.out.print("Please input the valid number between 0-15");
			System.exit(1);
		}
		else {
			char[] hexDigits = {
				'0', '1', '2', '3', '4', '5', '6', '7', 
			    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
			  };
			System.out.print("The hex number is: 0x0" + hexDigits[a]);;
		}
	}
}