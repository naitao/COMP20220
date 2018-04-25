package C6;
import java.util.Scanner;

import chapter6_examples.RandomCharacter;

public class TestRandomCharacter1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = ' ';
		String str = "";
		do {
			ch = RandomCharacter.getRandomLowerCaseLetter();
			str += ch;
		} while (ch != 'z');
		System.out.println(str);
	}
}