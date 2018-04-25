package C7;
import java.util.Scanner;

public class CountLetterSinArray{
	public static void main(String[] args) {
		String letters = "";
		for (int i = 0; i < 20; i++) {
			letters += (char)((int)(Math.random() * 26) + 'a');
		}
		System.out.println(letters);
		int[] array = new int[26];
		for (int i = 0; i < letters.length(); i++) {
			array[(int)(letters.charAt(i)-'a')] += 1;
		}
		for (int i = 0 ; i < array.length; i++)
			if (array[i] != 0)
				System.out.println((char)(i+'a') + ": " + array[i]);
	}
}
