package practical4_16212141;
public class Q2 {
	public static void main(String[] args) {
		int count = 1;
		int j = 0;
		while(count<=4) {
				if (isPerfectNumber(j)) {
					System.out.print(j+", ");
					count += 1;
				}
				j++;
		}
	}
	
	public static boolean isPerfectNumber(int number) {
		if (number <= 0)
			return false;
		int sum = 0;
		for (int i = 1; i <= number/2; i++) {
			if (number % i == 0)
				sum += i;
		}
		return (number == sum);
	}
}