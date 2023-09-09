package IntigerPallindrome;

public class IntigerPallindrome {
	public void isNumberPallindrome(int num) {
		
		int n = num;
		
		int sum = 0;
		
		while(num>0) {
			int r = num%10;
			sum = sum*10 + r;
			num = num/10;
		}
		
		if(sum == n) {
			System.out.println("Yes! is a pallindrome number");
		}
		else {
			System.out.println("No! is not a pallindrome number");
		}
	}
}
