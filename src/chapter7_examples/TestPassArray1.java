/*
 * A program to demonstrate the differences between passing primitive data type 
 * variables and array variables to methods.
 */

package chapter7_examples;

public class TestPassArray1 {
	public static void main(String[] args) {
		int x = 1; // Declare an integer and assign the value 1 to x
		int[] y = new int[3]; // Declare and create an array of int values
		
		System.out.println("Before method call:");
		System.out.println("x is " + x + "\t\t y[0] is " + y[0]);
		
		foo(x, y); // Invoke method foo with arguments x and y

		System.out.println("\nAfter method call:");
		System.out.println("x is " + x + "\t\t y[0] is " + y[0]);
	}
	
	public static void foo(int n, int[] arr) {
		n = 1001; // Assign a new value to n
		arr[0] = 5555; // Assign a new value to arr[0]
		
		System.out.println("\nInside method:");
		System.out.println("n is " + n + "\t arr[0] is " + arr[0]);
	}
}

