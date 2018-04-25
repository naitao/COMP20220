package practical7_16212141;

public class CheckingAccount extends Account{
	private double overdraftLimit;
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
		overdraftLimit = 1000;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double amount) {
		overdraftLimit = amount;
	}
	@Override
	public void withdraw(double amount) {
		double balance = super.getBalance();
		if ((balance + overdraftLimit - amount) < 0) {
			System.out.println("Your current balance is $" + 
				balance + ". Your overdraft limit is $" + overdraftLimit +
				". You have attempted to withdraw $" + amount + 
				"This transaction cannot be completed. Your balance is unchanged.");
		}
		else {
			balance -= amount;
			super.setBalance(balance);
		}
	}
	@Override
	public double getMonthlyInterest() {
		if (super.getBalance() < 0)
			return 0;
		else
			return super.getMonthlyInterest();
	}
	@Override
	public String toString() {
		return "overdraftLimit = " + overdraftLimit + ", " + super.toString();
	}
	
}