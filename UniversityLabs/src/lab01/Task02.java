package lab01;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print your square's side:");
		int a = sc.nextInt();
		
		areaCalculate(a);
		perimeterCalculate(a);
		diagonalLengthCalculate(a);
		
		sc.close();
	}
	
	public static void areaCalculate(int a) {
		System.out.println(a * a);
	}
	
	public static void perimeterCalculate(int a) {
		System.out.println(a * 4);
	}
	
	public static void diagonalLengthCalculate(int a) {
		System.out.println(a * Math.sqrt(a));
	}

}
