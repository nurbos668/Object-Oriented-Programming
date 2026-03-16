package problem3;

public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount(int a, double interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * (interestRate / 100);
		deposit(interest);
		System.out.println("Added interest: $" + interest + " at rate " + interestRate);
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Type of account: Savings | Interest rate: " + this.interestRate + "%";
 	}
}
