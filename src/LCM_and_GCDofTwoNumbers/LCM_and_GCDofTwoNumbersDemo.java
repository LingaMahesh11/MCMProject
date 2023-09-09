package LCM_and_GCDofTwoNumbers;

import java.util.Scanner;

public class LCM_and_GCDofTwoNumbersDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the first number : ");
		int firstNum = scan.nextInt();
		
		System.out.println("Enter the second number : ");
		int secondNum = scan.nextInt();
		
		LCM_and_GCDofTwoNumbers result = new LCM_and_GCDofTwoNumbers();
		
		result.lcmAndGcd(firstNum, secondNum);
	}

}
