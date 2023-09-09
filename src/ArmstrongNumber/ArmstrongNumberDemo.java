package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to check weather it is armstron number or not :");
		int num = scan.nextInt();
		
		ArmstrongNumber result = new ArmstrongNumber();
		
		boolean armstrongCheck = result.isArmstrongNumber(num);
		
		if(armstrongCheck) {
			System.out.println("Yes! '" + num + "' is a armstrong number");
		}
		else {
			System.out.println("No! '" + num + "' is not a armstrong number");
		}
		scan.close();
	}

}
