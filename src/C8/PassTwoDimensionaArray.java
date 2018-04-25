package C8;
import java.util.Scanner;

public class PassTwoDimensionaArray{
	public static void main(String[] args) {
		
	int[][] array = new int[2][3];
	createArray(array);
	showArray(array);
	System.out.print("\nThs sum of elements is: ");
	System.out.print(getSum(array));
	}
	
	public static int[][] createArray(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = (int)(Math.random()*10);
		}
		return arr;
	}
	
	public static void showArray(int [][] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
		}
	}
	
	public static int getSum(int [][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				sum += arr[i][j];
		}
		return sum;
				
	}
}
