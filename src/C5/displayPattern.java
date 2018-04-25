package C5;
import java.util.Scanner;

public class displayPattern{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an integer:");
		int n = input.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print(j);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
}