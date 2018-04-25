package C6;
import java.util.Scanner;

public class RandomCharacter{
	public static void main(String[] args)
	{	
		System.out.println(randomLowerCaseStr());
		System.out.println(randomUpperCaseStr());
		System.out.println(randomUnicodeCharacter());		
	}
	public static String randomLowerCaseStr()
	{
		int i=0;
		String line = "";
		while (i != 25)
		{
			i = (int)(Math.random() * 26);
			line = (char)('a' + i) + line;
		}
		return line;
	}
	
	public static String randomUpperCaseStr() {
		int i = 0;
		String line = "";
		while (i != 25)
		{
			i = (int)(Math.random() * 26);
			line = (char)('A' + i) + line;
		}
		return line;
	}
	public static String randomUnicodeCharacter() {
		int i = 0;
		String line = "";
		while (i != 100)
		{
			i = (char)(Math.random() * 108);
			line = (char)(i) + line;
		}
		return line;
	}
}