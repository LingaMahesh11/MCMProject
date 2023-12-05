package secondLargest;

import java.util.Arrays;

public class SecondLargest {
	public int secondLargest(int arr[]) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-2];
	}
}
