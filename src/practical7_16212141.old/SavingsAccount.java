import practical6_16212141;
import java.util.Scanner;

public class SavingsAccount extends Account{
	public SavingsAccount() {
		
	}
	@Override
	public void withdraw(double money) {
		balance -= money;
	}
}