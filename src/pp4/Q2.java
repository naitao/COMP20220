package pp4;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
	int count = 0;
	int testNum = 1;
	while (count<4) {
		if (isPerfectNum(testNum)){
			System.out.println(testNum + " ");
			count += 1;
			}
		testNum += 1;
		}
	}
	public static boolean isPerfectNum(int number) {
		int[] elements = new int[(int)(number/2)];
		int count = 0;
		for (int i = 1 ; i < (int)(number/2)+1; i++) {
			if (number % i == 0)
				elements[count++] = i;
		}
		int sum = 0;
		for (int i = 0; i < elements.length; i++)
			sum += elements[i];
		return sum == number;
	}
	
	public static void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}