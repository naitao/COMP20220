package pp5;
import java.util.Scanner;

public class Q4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = {"hello", "world","shoe", "student","book", "girl", "boy", "teacher"};
		String word;
		char letter;
		char[] wordArr;
		int ret = 0;
		int count = 0;
		char isContinue = 'y';
		while (isContinue == 'y')
		{
			word = words[(int)(Math.random()*words.length)];
			letter = ' ';
			wordArr = initGuessArr(word.length());
			ret = 0;
			count = 0;
			while(!isFinished(wordArr)) {
				System.out.print("Guess a letter: " + displayGuess(wordArr) + "> ");
				letter = input.nextLine().charAt(0);
			
				ret = getGuessArr(wordArr, word, letter);
				if (ret == 1)
					System.out.println("\t" + letter + " is alread in word\n");
				else if (ret == 2)
				{
					System.out.print("\t" + letter + " is not found\n");
					count += 1;
				}
			}
			System.out.println("You win. The word is '" + word + "' you guessed for " + count + " times!");
			System.out.println("Please enter 'y' to continue:");
			isContinue = input.nextLine().charAt(0);
		}
		System.out.println("Finished!");
	}
	public static boolean isFinished(char[] guess)
	{
		for (int i = 0; i<guess.length;i++)
			if (guess[i] == '*')
				return false;
		return true;
	}
	public static String displayGuess(char[] guess) {
		String line = "";
		for (int i = 0; i < guess.length; i++)
			line += guess[i];
		return line;
	}
	public static char[] initGuessArr(int size) {
		char[] guess = new char[size];
		for (int i = 0; i<size; i++)
			guess[i] = '*';
		return guess;
	}
	public static int getGuessArr(char[] guessArr, String word, char letter) {
		int ret = 2;
		
		for (int i = 0; i< word.length(); i++)
		{
			
			if (word.charAt(i) == letter && guessArr[i] == '*')
			{
				guessArr[i] = letter;
				return 0;
			}
			else if (word.charAt(i) == letter && guessArr[i] == letter)
				ret = 1;
		}
		return ret;
	}
}