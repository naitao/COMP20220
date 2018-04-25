package T6;
import practical6_16212141.*;
import java.util.Date;
import java.util.Scanner;

public class TestAccount{
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
		Account a1 = new Account();
		System.out.println("Please input a2 balance:");
		double a = input.nextDouble();
		Account a2 = new Account(12876, a);
		System.out.println("Please input a3 balance:");
		double b = input.nextDouble();
		Account a3 = new Account(19822, b);
		System.out.println("a1: "+ a1.toString());
		System.out.println("a2: "+ a2.toString());
		System.out.println("a3: "+ a3.toString());
		
		System.out.println("After re-setting AnnualInterestRate...");
		a1.setAnnualInterestRate(1.0);
		System.out.println("a1: "+ a1.toString());
		a2.setAnnualInterestRate(0.2);
		System.out.println("a2: "+ a2.toString());
		a3.setAnnualInterestRate(0);
		
		System.out.println("a3: "+ a3.toString());
		System.out.println("a3 monthly interest: " + a3.getMonthlyInterest());
		
		a3.withdraw(25.5);
		System.out.println("a3 withdraw 25.5, balance: " + a3.getBalance());
		a3.deposit(25.5);
		System.out.println("a3.despoist 25.5, balance: " + a3.getBalance());		
		
	}
}
