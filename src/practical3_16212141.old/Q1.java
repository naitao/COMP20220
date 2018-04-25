package practical3_16212141;
import java.util.Scanner;

public class Q1{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input string:");
		String line = input.nextLine();
		String vowels = "aeiou";
		char letter;
		int vowel_count = 0;
		int consonant_count = 0;
		for(int i=0; i < line.length(); i++) {
			letter = Character.toLowerCase(line.charAt(i));
			if (Character.isLetter(letter)) {
				if (vowels.indexOf(letter) != -1)
					vowel_count += 1;
				else
					consonant_count += 1;
			}
		}
		System.out.print("There are " + vowel_count + " vowels and " + consonant_count + " consonants in '" + line + "'");
	}
}


