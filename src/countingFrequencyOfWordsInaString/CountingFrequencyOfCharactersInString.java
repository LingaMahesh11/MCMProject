package countingFrequencyOfWordsInaString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingFrequencyOfCharactersInString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		
		String s = scan.next();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> result : map.entrySet()) {
			System.out.println(result.getKey() + " : " + result.getValue());
		}
		
		//System.out.println(map);
		scan.close();
	}
}
