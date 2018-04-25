/*
 * A program to demonstrate passing primitive data type 
 * variables to methods.
 */

package chapter7_examples;

public class TestPassPrimitive {
	public static void main(String[] args) {
		int i = 5;

		System.out.println("Before method call:");
		System.out.println("i is: " + i + "\n");
		
		// invoke method foo
		foo(i);
		
		System.out.println("After method call:");
		System.out.println("i is: " + i + "\n");
		
	}
	
	public static void foo(int n) {
		n *= 10;
		System.out.println("Inside method:");
		System.out.println("n is: " + n + "\n");
	}
}
