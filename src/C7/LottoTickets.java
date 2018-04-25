/*
 * 
 * Suppose you play Pick-10 lotto. Each ticket has 10 numbers ranging from 1 to 99, inclusive. 
 * Assume that the numbers in a ticket are picked randomly. 
 * Further, assume that the same number may appear in a ticket more than once.
 * Over all your tickets, you wish to have all the numbers from 1 to 99 included at least once. 
 * Write a program that generates lotto tickets. Print the tickets to the standard output. 
 * The program should exit when all numbers from 1 to 99 are included at least once in the 
 * tickets, and the number of tickets generated should be displayed.
*/
package C7;
import java.util.Scanner;

public class LottoTickets{
	public static void main(String[] args) {
		int count = 0;
		String loto = "";
		int digit = 0;
		int[] digits = new int[99];
		while (!checkDigit(digits)) {
			for (int i = 0; i < 10; i++) {
				digit = (int)(Math.random() * 99 + 1);
				updateDigit(digits, digit);
				if (digit < 10)
					loto += "0" + Integer.toString(digit) + " ";
				else
					loto += Integer.toString(digit) + " ";
			}
			count += 1;
			System.out.println(loto);
			loto = "";	
		}
		System.out.format("The number of loto is: %d", count);
	}
	public static void updateDigit(int [] digits, int i) {
		digits[i-1] += 1;
	}
	public static boolean checkDigit(int [] digits) {
		for (int i = 0; i <= 98; i++)
			if (digits[i]==0)
				return false;
		return true;
	}
	
}