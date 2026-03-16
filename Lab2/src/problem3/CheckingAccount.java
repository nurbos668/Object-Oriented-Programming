package problem3;

public class CheckingAccount extends Account{
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEE = 0.02;
	
	private int	cnt;
	
	public CheckingAccount(int a) {
		super(a);
		this.cnt = 0;
	}
	
	@Override 
	public void deposit(double sum) {
		super.deposit(sum);
		cnt++;
	}
	
	@Override 
	public void withdraw(double sum) {
		super.withdraw(sum);
		cnt++;
	}
	
	public void deductFee() {
		if (cnt > FREE_TRANSACTIONS) {
			int t = cnt - FREE_TRANSACTIONS;
			double totalFee = t * TRANSACTION_FEE;
			
			if (getBalance() > totalFee) {
				withdraw(totalFee);
				System.out.println("Deducted fee: $" + totalFee + " for " + t + " transactions");
			}
			else {
				System.out.println("Inufficient balance to deduct fees");
			}
		}
		else {
			System.out.println(cnt + "/" + FREE_TRANSACTIONS);
		}
		cnt = 0;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Type of account: Checking | Transactions: " + this.cnt + "/" + FREE_TRANSACTIONS;
 	}

}
