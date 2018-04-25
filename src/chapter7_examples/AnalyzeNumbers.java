/*
 * A program that reads in numbers from the console, computes their average, and 
 * finds out how many numbers are above the average. 
 */

package chapter7_examples;

import java.util.Scanner;

public class AnalyzeNumbers {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter how many numbers should be read
		System.out.print("How many numbers should be read? ");
		int n = input.nextInt();

		// Declare and create an array 
		double[] numbers = new double[n];

		// Declare a variable sum (to hold the sum of the numbers entered)
		double sum = 0;

		// Prompt the user to enter the numbers; read the numbers into the array
		// and update sum during each iteration of the loop
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}

		// Compute the average
		double average = sum / n;

		// Determine how many elements in array numbers which are above the average
		int count = 0; 
		for (int i = 0; i < numbers.length; i++) 
			if (numbers[i] > average)
				count++;

		// Display results
		System.out.println("The average is " + average);
		System.out.println("The number of elements above the average is " + count);
	}
}