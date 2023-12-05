package addingFirstAndLastDigitsOfNumnber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String s = scan.next();
		
		String firstNum = "";
		String lastNum = "";
		
		char[] crr = s.toCharArray();
		for(int i =0;i<crr.length;i++) {
			if(i == 0) {
				firstNum += crr[i];
			}
			if(i == crr.length-1) {
				lastNum += crr[i];
			}
		}
		
		int sum = Integer.parseInt(firstNum) + Integer.parseInt(lastNum);
		
		System.out.println("The sum of first digit and last digit in " + s + " is " + sum);
		scan.close();
	}
}
