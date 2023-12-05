package findingMissingNumberInArray;

public class FindingMissingNumberInArray {
	public int missing(int[] arr) {
		
		int missing = 0;
		for(int i =0;i<arr.length-1;i++) {
			if((arr[i]+1) != arr[i+1]) {
				missing = arr[i] + 1;
				break;
			}
		}
		
		return missing;
	}
}
