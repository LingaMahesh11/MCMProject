package FibbonacciSeries;

import java.util.Scanner;

public class FibbonacciSeriesDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number till you want the fibbonacci series:");
		int num = scan.nextInt();
		
		FibbonacciSeries result = new FibbonacciSeries();
		result.fibbonacciSeries(num);
		scan.close();
	}

}
