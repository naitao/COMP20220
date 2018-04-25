package pp5;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 2 strings: ");
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		System.out.println("LCS of two strings is: " + getLCS(str1, str2));		
	}
	public static String getLCS(String s1, String s2) {
		int lengthA = s1.length();
		int lengthB = s1.length();
		int lengthMin = lengthA < lengthB ? lengthA : lengthB;
		String newLine = "";
		for (int i = 0; i < lengthMin; i++) {
			if (s1.charAt(s1.length()-i-1) == s2.charAt(s2.length()-i-1))
				newLine = s1.charAt(s1.length()-i-1) + newLine;
			else
				break;
		}
		return newLine;
	}
}