package com.kn.pangram;

import java.util.HashSet;
import java.util.Scanner;

public class PangramChecking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence to check weather it is pangram or not");
		String s = scan.nextLine();
		
		boolean result = isPangram(s);
		if(result) {
			System.out.println("Yes the sentence is a pangram");
		}
		else {
			System.out.println("NO");
		}
		scan.close();
	}
	
	public static boolean isPangram(String s) {
		
		HashSet<Character> unique = new HashSet<>();
		s = s.toLowerCase();
		
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c)) {
				unique.add(c);
			}
		}
		return unique.size() == 26;
	}
}
