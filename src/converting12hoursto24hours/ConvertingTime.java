package converting12hoursto24hours;

import java.util.Scanner;

public class ConvertingTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time in (HH:MM:SS:AM/PM) in this format only");
		String time = scan.nextLine();
		
		converting(time);
		scan.close();
	}
	
	public static void converting(String s) {
		
		
		String[] srr = s.split(":");
		if(srr[srr.length-1].equalsIgnoreCase("AM")) {
			System.out.println(s);
			//break;
		}else {
			int n = Integer.parseInt(srr[0]);
			int timeDifference = (12+n);
			srr[0] = Integer.toString(timeDifference);
			
			for(int i =0;i<srr.length-2;i++) {
				System.out.print(srr[i] + ":");
			}
			System.out.print(srr[2]);
		}
	}
}
