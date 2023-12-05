package differenceBetweenTwoDates;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DifferenceBetweenTwoDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date in (YYYY-MM-DD) this format");
		
		String givenDate = scan.nextLine();
		
		LocalDate presentDate = LocalDate.of(2023,12,05);
		
		String[] srr = givenDate.split("-");
		int[] arr = new int[3];
		
		for(int i =0;i<srr.length;i++) {
			arr[i] = Integer.parseInt(srr[i]);
		}
		
		LocalDate localDate = LocalDate.of(arr[0],arr[1],arr[2]);
		
		Period p = Period.between(presentDate, localDate);
		
		System.out.println(p.getDays());
		
		scan.close();
	}
}
