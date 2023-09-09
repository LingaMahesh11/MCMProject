package StringPallindrome;

public class StringPallindrome {
	public boolean isStringPallindrome(String input) {
		
		char[] crr = input.toCharArray();
		
		StringBuffer s = new StringBuffer();
		
		for(int i = crr.length-1;i>=0;i--) {
			s.append(crr[i]);
		}
		
		String result = s.toString();
		
		if(result.equals(input)) {
			return true;
		}
		return false;
	}
}
