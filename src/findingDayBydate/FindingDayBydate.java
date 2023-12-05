package findingDayBydate;

import java.util.Scanner;

public class FindingDayBydate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
	}

	public static String findDay(int date, int month, int year) {

		int presentDate = 31;
		int presentMonth = 12;
		int presentYear = 2023;

		int difference = 0;
		if (year < presentYear) {
			int difDate = 0;
			int difMonth = 0;
			int difYear = 0;
			
			difDate = presentDate - date;
			difMonth = presentMonth - month;
			difYear = presentYear - year;
			
			//if()
			
		}

		return null;
	}
}
