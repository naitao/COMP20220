package test_16212141;

public class Q1 {
	public static void main (String[] args) {
		// Should print "M1ss2ss3pp4"
		System.out.println(replace("Mississippi", 'i'));

		// Should print "Hello World"
		System.out.println(replace("Hello World", 'w'));

		// Should print "1234"
		System.out.println(replace("1234", '1'));
	}

	// Returns a string with every occurrence of a character (ch) replaced as follows: 
	// The first occurrence of the character should be replaced with ‘1’, the second occurrence with ‘2’, etc.
	public static String replace(String str, char ch) {
		String newStr = "";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				newStr = newStr + Integer.toString(count);
				count += 1;
			}
			else {
				newStr = newStr + str.charAt(i);
			}
		}
		return newStr;
	}
}
