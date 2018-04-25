package C5;
import java.util.Scanner;

public class ReplaceX{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string:");
		String line = input.nextLine();
		String newLine = "";
		newLine = line.replace('x', '_');
		newLine = newLine.replace('X', '_');
		System.out.println(line);
		System.out.println(newLine);
	}
}