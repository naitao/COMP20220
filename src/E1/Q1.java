package E1;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a word:");
		String word = input.nextLine();
		
		
	}
	
	public static char[] getLowerLetter(String word) {
		int[] letterArray = new int[26]; 
		for (int i = 0; i< word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				letterArray[word.charAt]
			}
		}
	}
}