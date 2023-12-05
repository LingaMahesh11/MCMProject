package halfLowerCaseAndHalfUpperCase;

public class HalfLowerCaseAndHalfUpperCase {

	public String changingCases(String s) {
		
		String lowerCase="";
		String upperCase="";
		
		int mid = (0 + s.length()-1)/2;
		
		for(int i =0;i<s.length();i++) {
			if (i<mid) {
				lowerCase += Character.toLowerCase(s.charAt(i));
			}
			else {
				upperCase += Character.toUpperCase(s.charAt(i));
			}
		}
		
		return (lowerCase + upperCase);
	}
}
