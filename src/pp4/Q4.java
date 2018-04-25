package pp4;
import java.util.Scanner;

public class Q4{
	public static void main(String[] args) {
	int count = 0;
	int testNum = 2;
	while(count < 10) {
		if (isPrime(testNum)) {
			System.out.print(testNum + " ");
			count += 1;
			}
		testNum += 1;
		}
	}
	public static boolean isPrime(int number) {
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}