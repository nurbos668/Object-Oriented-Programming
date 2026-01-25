package Lab01;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		printRoots(a, b, c);
		
		sc.close();
	}
	
	public static void printRoots(int a, int b, int c) {
		double D = Math.pow(b, 2) - (4 * a * c);
		
		if (D < 0) {
			System.out.println("No roots");
		} else if (D == 0) {
			System.out.println(-b / (2 * a));
		} else {
			System.out.println((-b + Math.sqrt(D)) / (2 * a));
			System.out.print((-b - Math.sqrt(D)) / (2 * a));
		}
	}
	
}
