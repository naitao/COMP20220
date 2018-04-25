package C4;
import java.util.Scanner;

public class OrderTwoCities{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 2 cities:");
		String name1 = input.next();
		String name2 = input.next();
		System.out.println("They are: " + name1 + " and " + name2);
	}
}