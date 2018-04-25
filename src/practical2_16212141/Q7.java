package practical2_16212141;
import java.util.Scanner;

public class Q7{
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a letter:");
		char ch = input.next().charAt(0);
		String vowels = "aeiou";
		
		if (vowels.indexOf(Character.toLowerCase(ch))!=-1) {
			System.out.print(ch + " is vowel!");
		}
		else {
			if (Character.isLetter(ch))
				System.out.print(ch + " is consonant!");
			else
				System.out.print(ch + " is NOT letter!");
		}
	}	
}