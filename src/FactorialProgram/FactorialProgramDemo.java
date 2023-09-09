package FactorialProgram;

import java.util.Scanner;

public class FactorialProgramDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get it factorial value : ");
		int num = scan.nextInt();
		
		FactorialProgram result = new FactorialProgram();
		int factorial = result.factorial(num);
		
		System.out.println("The factorial of "+num + " is "+factorial);
		scan.close();
	}

}
