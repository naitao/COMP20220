package C7;
import java.util.Scanner;

public class TestPassArray1{
	public static void main(String[] args) {
		int[] num = new int[3];
		int n = 10;
		System.out.format("Before call, n = %d, m[0] = %d\n", n, num[0]);
		foo(n, num);
		System.out.format("After call, n = %d, m[0] = %d\n", n, num[0]);
	}
	public static void foo(int n, int[] m) {
		n *= 10;
		m[0] += 20;
		System.out.format("Inside method, n= %d, m[0]= %d\n", n, m[0]);
	}
}