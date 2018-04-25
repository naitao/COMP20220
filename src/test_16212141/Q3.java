package test_16212141;

public class Q3 {
	public static void main(String[] args) {
		// Arrays of test strings...
		String[] balanced = {"", "()", "()()", "(())", "(()())"};
		String[] notBalanced = {")(", ")()(", "(()", "()((", "()))"};    
				
		// Should print true for these strings...
		for (int i = 0; i < balanced.length; i++)
			System.out.println("\"" + balanced[i] + "\" - " + isBalanced(balanced[i]));
		
		System.out.println();
		
		// Should print false for these strings...
		for (int i = 0; i < notBalanced.length; i++)
			System.out.println("\"" + notBalanced[i] + "\" - " + isBalanced(notBalanced[i]));
		
	}
	
	// Returns true if a string of parentheses is correctly balanced; false otherwise.
	// Assume p contains only '(' and ')' characters.
	public static boolean isBalanced(String p) {
		return isNumberBalance(p) && isValid(p);
	}
	
	public static boolean isNumberBalance(String p) {
		int leftCount = 0;
		int rightCount = 0;
		for (int i=0; i < p.length(); i++) {
			if (p.charAt(i) == '(')
				leftCount += 1;
			else if (p.charAt(i) == ')'){
				rightCount += 1;
			}
		}
		return leftCount == rightCount;
	}
	public static boolean isValid(String p) {
		//make sure the number of '(' is always >= the number of ')' in any positions
		int leftCount = 0; //'('
		int rightCount = 0; //')'
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(')
				leftCount += 1;
			if (p.charAt(i) == ')')
				rightCount += 1;
			if (rightCount > leftCount)
				return false;
		}
		return true;
	}

}
