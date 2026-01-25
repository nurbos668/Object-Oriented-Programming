package Lab01;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double accountBalance = sc.nextInt();
		
		double interest = sc.nextInt();
		
		accountUpdater(accountBalance, interest);
		
		sc.close();
	}
	
	public static void accountUpdater(double accBalance, double interest) {
		accBalance += accBalance * (interest / 100);
				
		System.out.print(accBalance);
	}

}
