package pp5;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the number of the elements:");
		int number = input.nextInt();
		int [] arr = new int[number];
		for (int i = 0; i < number; i++)
			arr[i] = input.nextInt();
		if (isSorted(arr))
			System.out.println("It is sorted!");
		else
			System.out.println("It is not sorted!");
	}
	public static boolean isSorted(int[] arr) {
		for (int i = 0;i<arr.length-1; i++) {
			if (arr[i+1] < arr[i])
				return false;
		}
		return true;
	}
}