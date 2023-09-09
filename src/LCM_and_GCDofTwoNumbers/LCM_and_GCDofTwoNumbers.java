package LCM_and_GCDofTwoNumbers;

public class LCM_and_GCDofTwoNumbers {
	public void lcmAndGcd(int firstNum, int secondNum) {
		
		int gcd=0;
		for (int i = 1; i <= firstNum && i <= secondNum; i++) {
			if (firstNum % i == 0 && secondNum % i == 0) {
				gcd =i;
			}
		}
		
		int lcm = (firstNum*secondNum)/gcd;
		
		System.out.println("The GCD of two numbers is " + gcd);
		System.out.println("The LCM of two numbers is " + lcm);
	}
}
