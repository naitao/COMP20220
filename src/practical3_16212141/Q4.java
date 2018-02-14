package practical3_16212141;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string:");
		String line = input.nextLine();
		String newLine = "";
		int stringLength = line.length();
		for (int i = 0; i < stringLength; i++)
			newLine += line.charAt(stringLength-1-i);
		System.out.print(newLine);
	}
}