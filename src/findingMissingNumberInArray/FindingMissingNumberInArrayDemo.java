package findingMissingNumberInArray;

public class FindingMissingNumberInArrayDemo {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,8,9,10};
		
		FindingMissingNumberInArray f = new FindingMissingNumberInArray();
		
		int result = f.missing(arr);
		
		System.out.println("Missing number = " + result);
	}
}
