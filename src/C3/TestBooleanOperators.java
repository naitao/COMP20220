package C3;
import java.util.Scanner;

public class TestBooleanOperators{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int n = input.nextInt();
		if (n % 3 == 0 && n % 2 == 0)
			System.out.println(n + " is divisible by both 2 and 3");
		if (n % 3 == 0 || n % 2 == 0 || (n % 3 == 0 && n % 2 == 0))
			System.out.println(n + " is divisible by 2 or 3 or both");
		if ((n % 2 == 0 || n % 3 == 0 ) && !(n % 2 == 0 && n % 3 == 0 ))
			System.out.println(n + " is divisible by 2 o 3 but not both");
	}
}