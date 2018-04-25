package test_16212141;

public class Q2 {
	public static void main(String[] args) {
		// Test cases

		// Should print 'A'
		System.out.println(convert('a'));

		// Should print 'Z'
		System.out.println(convert('z'));

		// Should print 'A'
		System.out.println(convert('A'));

		// Should print '@'
		System.out.println(convert('@'));
	}

	// Returns the uppercase equivalent of a lowercase letter ('a' to 'z'). The method should
	// return ch if ch is not a lowercase letter.
	public static char convert(char ch) {
		char letter = ' ';
		int offset = (int)(ch - 'a');
		if (Character.isLowerCase(ch)) {
			letter = (char)('A' + offset);
		}
		else
			letter = ch;
		return letter;
		
		//return '\u0000';
	}
}
