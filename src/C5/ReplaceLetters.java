package C5;
import java.util.Scanner;

public class ReplaceLetters{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string:");
		String line = input.nextLine();
		String newLine = "";
		for (int i = 0; i< line.length(); i++) {
			if (Character.isUpperCase(line.charAt(i)))
				newLine = newLine + Character.toLowerCase(line.charAt(i)) ;
			else if (Character.isLowerCase(line.charAt(i))) {
				newLine = newLine + Character.toUpperCase(line.charAt(i));
			}
		}
		System.out.println(newLine);
	}
}