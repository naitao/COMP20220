package C5;
import java.util.Scanner;

public class RepeatAdditionQuiz3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = (int)(Math.random()*100);
		int n2 = (int)(Math.random()*100);
		do{
			System.out.print("Please input the result for " + n1 + " plus " + n2 + ":");
			int result = input.nextInt();
			if (result == n1+n2) {
				System.out.print("Correct!\n");
				break;
			}
			else {
				System.out.print("It is not correct!\n");
			}
		} while (true);
		
		
	}
}