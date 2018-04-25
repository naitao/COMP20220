package practical5_16212141;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pleaset input the first string:");
		String st1 = input.next();
		System.out.print("Please input the second string:");
		String st2 = input.next();
		
		System.out.print("'" + st1 + "' and '" + st2 + "' 's largest common Suffix is: " + getLCS(st1, st2));
	}

	public static String getLCS(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int minLen = len1 < len2 ? len1 : len2;
		
		String newStr = "";
		for (int i = 0; i < minLen; i++) {
				if (s1.charAt(len1-1-i) == s2.charAt(len2-1-i))
					newStr = s1.charAt(len1-1-i) + newStr;
				else
					break;
			}
		return newStr;
		}
		
}