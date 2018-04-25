package C4;
import java.util.Scanner;

public class HexDigit2Dec{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a hexadecimal digit: ");
		String hex = input.nextLine();
		int num = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (Character.isLetter(hex.charAt(i)))
				num = num * 16 + Character.toLowerCase(hex.charAt(i)) - 'a' + 10;
			else if (Character.isDigit(hex.charAt(i)))
				num = num * 16 + hex.charAt(i) - '0';
		}
		System.out.println(hex + " converts to " + num);
		
	}
}