package binarySearch;

public class BinarySearch {
public boolean binarySerch(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high);
		
		for(int i = 0;i<arr.length;i++) {
			if(mid == target) {
				return true;
			}
			else if(mid<target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return false;
	}
}
