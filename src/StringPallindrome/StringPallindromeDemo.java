package StringPallindrome;

import java.util.Scanner;

public class StringPallindromeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to check weather it is pallindrome or not :");
		String input = scan.next();
		
		StringPallindrome result = new StringPallindrome();
		
		boolean strinPallindromeCheck = result.isStringPallindrome(input);
		
		if(strinPallindromeCheck) {
			System.out.println("Yes! ' "+input+" ' is a Pallindrome" );
		}
		else {
			System.out.println("No! ' "+input+" ' is not a Pallindrome" );
		}
		scan.close();
	}

}
