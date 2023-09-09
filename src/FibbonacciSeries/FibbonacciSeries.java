package FibbonacciSeries;

public class FibbonacciSeries {
	public void fibbonacciSeries(int num) {
		
		int firstNumber = 0;
		int secondNumber = 1;
		for(int i =1;i <= num;i++) {
			System.out.print(firstNumber+" ");
			int nextNumber = firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			
		}
	}
}
