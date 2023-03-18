package tests;

import java.util.Scanner;

// finding factorial
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		/*
		 * The line factorial = 1; initializes the factorial variable to 1. 
		 * This is because the factorial of any number is always 1 when multiplied by 1.
		 */
		int factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);

	}

}
