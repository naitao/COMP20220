package practical3_16212141;
import java.util.Scanner;

public class Q6B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input n:");
		int n = input.nextInt();
		for (int i=n; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
				System.out.print(' ');
			}
			System.out.print('\n');
			
		}
	}
}