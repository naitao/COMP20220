package C5;
import java.util.Scanner;

public class GuessNumber{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 100 + 1);
		System.out.print("Please input your guess: ");;
		int guess = input.nextInt();
		int count = 0;
		while (guess != number) {
			if (guess > number)
				System.out.print("The input number is too much.\n");
			else
				System.out.print("The input number is too small.\n");
			count += 1;
			System.out.print("Please input your guess again:");
			guess = input.nextInt();
		}
		System.out.print("Congratulations: you tried " + count + " times!\n");
}
}