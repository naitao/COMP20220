package practical3_16212141;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the first string:");
		String line1 = input.nextLine();
		System.out.print("Please input the second string:");
		String line2 = input.nextLine();
		String newLine = "";
		int minLength = (line1.length() < line2.length()) ? line1.length() : line2.length();
		for (int i = 0; i < minLength; i++) {
			if (line1.charAt(i) == line2.charAt(i))
				newLine += line1.charAt(i);
			else
				break;
		}
		if (newLine.length() == 0)
			System.out.print("no common prefix!");
		else
			System.out.print(newLine);
	}
}