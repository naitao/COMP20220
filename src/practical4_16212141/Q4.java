package practical4_16212141;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int count = 1;
		int j = 0;
		while (count<=10) {
			if (isPrime(j)) {
				System.out.print(j + ", ");
				count++;
			}
			j++;
		}
	}
	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for(int i = 2; i <= number/2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}