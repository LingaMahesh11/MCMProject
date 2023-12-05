package halfLowerCaseAndHalfUpperCase;

public class HalfLowerCaseAndHalfUpperCaseDemo {
	public static void main(String[] args) {
		String s = "MAHESH mahesh";
		
		HalfLowerCaseAndHalfUpperCase h = new HalfLowerCaseAndHalfUpperCase();
		String result = h.changingCases(s);
		
		System.out.println(result);
	}
}
