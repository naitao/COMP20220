package pp5;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a group of number: ");
		String strNum = input.nextLine();
		String[] strNumArr = strNum.split(" ");
		int number = strNumArr.length;
		int[] numArr = new int[number];
		for (int i = 0; i < strNumArr.length; i++)
			numArr[i] = Integer.parseInt(strNumArr[i]);
		if (isConsecutiveFour(numArr))
			System.out.println("It is consecutive integers!");
		else
			System.out.println("It is not consecutive integers!");
	}
	public static boolean isConsecutiveFour(int[] values) {
		int n = 1;
		
		for (int i = 0; i < values.length-1; i++)
		{
			if (values[i] == values[i+1])
				n += 1;
			else
				n = 1;
			if (n == 4)
				return true;
		}
		return false;
	}
}