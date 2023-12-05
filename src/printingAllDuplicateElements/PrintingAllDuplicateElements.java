package printingAllDuplicateElements;

import java.util.HashSet;
import java.util.Set;

public class PrintingAllDuplicateElements {

	public static void main(String[] args) {
		int[] arr = {10,30,50,20,30,40,70,40,50};
		
		//Set<Integer> set1 = new HashSet<Integer>();
		
		Set<Integer> set = new HashSet<Integer>();
		
//		for(int i =0;i<arr.length;i++) {
//			if(!set.contains(arr[i])) {
//				set.add(arr[i]);
//			}
//			else {
//				set1.add(arr[i]);
//			}
//		}
		int count = 1;
		
		for(int i = 0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				System.out.println(count+ " Duplicate found that is " + arr[i]);
				count++;
			}
			else {
				set.add(arr[i]);
			}
		}
		
		//System.out.println(set);
	}
}
