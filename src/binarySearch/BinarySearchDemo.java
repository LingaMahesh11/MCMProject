package binarySearch;

import java.util.Scanner;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Enter the array elements");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Now enter the target value");
		int target = scan.nextInt();
		
		BinarySearch b = new BinarySearch();
		boolean result = b.binarySerch(arr, target);
		
		if(result) {
			System.out.println(target + " is present in the array");
		}
		else {
			System.out.println(target + " is NOT present in the array");
		}
		
		scan.close();
	}
}
