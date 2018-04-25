package practical7_16212141;

public class SavingsAccount extends Account{
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
	@Override
	public void withdraw(double amount) {
		double balance = super.getBalance();
		if (balance - amount < 0) {
			System.out.println("Your current balance is $" + balance + 
					           ". You have attempted to withdraw $" + amount +
                                "This transaction cannot be completed. Your balance is unchanged");
		}
		else {
			balance -= amount;
			super.setBalance(balance);
		}
			
	}
	
}