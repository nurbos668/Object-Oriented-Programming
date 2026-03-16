package problem3;

import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;
	private int accCnt;
	
	public Bank() {
		accounts = new Vector<>();
		accCnt = 0;
	}
	
	public int openAcc(String accType, double initialBalance, double interestRate) {
		accCnt++;
		Account newAcc;
		
		if (accType.toLowerCase().equals("savings")) {
			newAcc = new SavingsAccount(accCnt, interestRate); 
		}
		else if (accType.toLowerCase().equals("checking")) {
			newAcc = new CheckingAccount(accCnt);
		}
		else {
			newAcc = new Account(accCnt);
		}
		
		if (initialBalance > 0) {
			newAcc.deposit(initialBalance);
		}
		
		accounts.add(newAcc);
		System.out.println("Opened new " + newAcc.getClass().getSimpleName());
		return accCnt;
	}
	
	public int openAcc(String accType) {
		return openAcc(accType, 0.0, 0.0);
	}
	
	public boolean closeAcc(int accNumber) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccNumber() == accNumber) {
				accounts.remove(i);
				System.out.println("Account " + accNumber + " is successfully closed");
				return true;
			}			
		}
		System.out.println("Account: " + accNumber + " not found");
		return false;
	}
	
	public void update() {
		for(Account acc : accounts) {
			if (acc instanceof SavingsAccount) {
				SavingsAccount s = (SavingsAccount) acc;
				s.addInterest();
			}
			else if(acc instanceof CheckingAccount) {
				CheckingAccount c = (CheckingAccount) acc;
				c.deductFee();
			}
			System.out.println(acc + " was updated");
		}
	}
	
	public Account getAcc(int accNumber) {
		for (Account acc : accounts) {
			if (acc.getAccNumber() == accNumber) {
				return acc;
			}
		}
		return null;
	}
	
	public void printAllAcc() {
		System.out.println("All bank accounts:");
		for (Account acc : accounts) {
			acc.print();
		}
	}
}
