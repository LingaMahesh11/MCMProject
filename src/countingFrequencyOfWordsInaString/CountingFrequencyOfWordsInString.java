package countingFrequencyOfWordsInaString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingFrequencyOfWordsInString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence");
		
		String s = scan.nextLine();
		
		String[] srr = s.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0;i<srr.length;i++) {
			if(map.containsKey(srr[i])) {
				map.put(srr[i], map.getOrDefault(srr[i], 0)+1);
			}
			else {
				map.put(srr[i], 1);
			}
		}
		
		System.out.println(map);
		scan.close();
	}
}
