package practical3_16212141;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string:");
		String line = input.nextLine();
		String newLine = "";
		char letter;
		for (int i = 0; i < line.length(); i++) {
			letter = line.charAt(i);
			if (Character.isLowerCase(letter)) {
				if (letter == 'z')
					newLine += 'a';
				else
					newLine += (char)(letter + 1);
			}
			else
				newLine += letter;
		}
		System.out.print(newLine);
	}
}