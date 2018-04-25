package practical3_16212141;
import java.util.Scanner;

public class Q6D{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input n:");
		int n = input.nextInt();
		for (int i=n; i>=1; i--) {
			for (int m=1; m<=n-i; m++)
				System.out.print("  ");
			for (int j=1; j<=i; j++) {
				System.out.print(j);
				System.out.print(' ');
			}
			System.out.print('\n');
			
		}
	}
}