package practical5_16212141;
import java.util.Scanner;

public class Q4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char isPlay = ' ';
		String[] words = {
				"hello",
				"world",
				"mail",
				"birthday",
				"ireland",
				"student",
				"administrator",
				"girl",
				"heel",
				"congratulation"};
		int index = 0;
		int count = 0;
		int checkUpdate = -1;
		do {
			index = (int) (Math.random() * words.length);
			String word = words[index].toLowerCase();
			char[] wordArray = new char[word.length()];
			// copy char * to word array
			for (int i = 0; i < word.length(); i++)
				wordArray[i] = '*';
			while(checkAsterisk(wordArray)) {
				System.out.print("Guest a letter " + display(wordArray) + " : ");
				
				char guessLetter = input.next().charAt(0);
				checkUpdate = updateLetter(wordArray, word, guessLetter);
				if (checkUpdate == -1) {
					System.out.print("\t" + guessLetter + " is not in this word\n");
					count += 1;
				}
				else if (checkUpdate == 1) {
					System.out.print("\t" + guessLetter + " is already in this word!\n");
				}
			}
			System.out.print("\nYou win! The word is [" + word + "], you missed " + count + " times\n");
			System.out.print("\nEnter 'y' to play again or any other character to exit: ");
			isPlay = input.next().charAt(0);
			count = 0;
			} while (isPlay == 'y');
		System.out.print("Finished!");
	}
	
	public static String display(char[] wordArray) {
		String word = "";
		for (int i = 0; i < wordArray.length; i++)
			word += wordArray[i];
		return word;
	}
	
    public static boolean checkAsterisk(char[] wordArray) {
    		for (int i = 0; i < wordArray.length; i++)
    			if (wordArray[i] == '*')
    				return true;
    		return false;
    }
    
	public static int updateLetter(char[] wordArray, String word, char letter) {
		for (int i = 0; i<word.length(); i++) {
			if (wordArray[i] == '*' && word.charAt(i) == letter)
			{
				wordArray[i] = letter;
				return 0;
			}
			else if (wordArray[i] == letter && word.charAt(i) == letter)
             	return 1;
		}
		return -1;
	}

}