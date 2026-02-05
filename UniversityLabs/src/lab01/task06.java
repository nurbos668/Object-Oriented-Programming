package lab01;

import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		isPalindrome(word);
		
		sc.close();
	}

	public static void isPalindrome(String word) {
		String reversed = new StringBuilder(word).reverse().toString();
		
		if (word.equals(reversed)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
