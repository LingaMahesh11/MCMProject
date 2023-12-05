package maxDifferenceInanArray;

import java.util.Scanner;

public class MaxDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Enter the elements");
		for(int i =0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Maximum difference = " + (max-min));
		scan.close();
	}
}
