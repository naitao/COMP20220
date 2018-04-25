package practical6_16212141;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0.045;
    private Date dateCreated;
    
    public Account() {
    		this(0, 0.0);
    }
    
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        }
    public int getId(){
        return id;
        }
    public double getBalance(){
        return balance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
        }
    public void setid(int id){
        this.id = id;
        }
    public void setBalance(double balance) {
    		this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
    		if (annualInterestRate > 0 && annualInterestRate < 1)
    			Account.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
    		return dateCreated;
    }
    public double getMonthlyInterest() {
    		return balance * annualInterestRate / 12;
    }
    public void withdraw(double money) {
    		balance -= money;
    }
    public void deposit(double money) {
    		balance += money;
    }
    public String toString() {
    		return "Account ID: " + id + 
    				", balance: " + balance  +
    				", datecreated: " + dateCreated;
    }
}