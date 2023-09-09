package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a prime or not :");
		int num = scan.nextInt();
		
		PrimeNumber result = new PrimeNumber();
		
		boolean prime = result.isPrime(num);
		
		if(prime) {
			System.out.println("Yes " + num + " is a prime number");
		}
		else {
			System.out.println("No " + num + " is not a prime number");
		}
		scan.close();
	}

}
