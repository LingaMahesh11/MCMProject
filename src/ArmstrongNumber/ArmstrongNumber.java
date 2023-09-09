package ArmstrongNumber;

public class ArmstrongNumber {
	public boolean isArmstrongNumber(int num) {
		
		int n= num;
		int n2 = num;
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		
		int sum = 0;
		while(n>0) {
			int r = n%10;
			sum = sum+(int)Math.pow(r, count);
			n = n/10;
		}
		
		if(sum==n2) {
			return true;
		}
		return false;
	}
}
