package problem3;

public class Account {
	private double balance;
	private int accNumber;
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccNumber() {
		return this.accNumber;
	}
	
	public void deposit(double sum) {
		if (sum > 0) {
			this.balance += sum;
			System.out.println("Deposited $" + sum + " to account: " + getAccNumber());
		}
		else {
			System.out.println("The amount can not be negative!");
		}
		
	}
	
	public void withdraw(double sum) {
		if (sum > 0 && sum <= balance) {
			this.balance -= sum;
			System.out.println("Withdrew $" + sum + " from account: " + getAccNumber());
		}
		else if (sum > balance){
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("The amount can not be negative!");
		}
		
	}
	
	public void transfer(double amount, Account other) {
		if (amount > 0 && amount <= balance) {
			this.balance -= amount;
			other.balance += amount;
			System.out.println("Transferred $" + amount + " from: " + this.accNumber + " to: " + other.accNumber);
		}
		else {
			System.out.println("Transfer failed because of insufficient balance or invalid amount");
		}
	}
	
	@Override
	public String toString() {
		return "Account number: " + this.accNumber + " | Balance: $" + this.balance ;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
