package IntigerPallindrome;

import java.util.Scanner;

public class IntigerPallindromeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check weather it is a pallindrome number or not");
		int num = scan.nextInt();
		
		
		IntigerPallindrome result = new IntigerPallindrome();
		result.isNumberPallindrome(num);
		scan.close();
	}

}
