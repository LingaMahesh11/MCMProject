package findingNextLargestNumberWithGivenNumber;

public class FindingNextLargest {
	public int nextLargest(int n) {
		
		int nextLargest = 1;
		
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		
		for(int i =1;n>0;i++) {
			if(i == 1) {
				int r = n%10;
				firstNum = r;
				n = n/10;
			}
			if(i == 2) {
				int r = n%10;
				secondNum = r;
				n = n/10;
			}
			if(i == 3) {
				int r = n%10;
				thirdNum = r;
				n = n/10;
			}
		}
		
		//if(first)
		
		return 0;
	}
}
