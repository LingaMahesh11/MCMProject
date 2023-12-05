package lowStockBuyingSellingAtHighPrice;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] {30,50,32,87,78};
		String s = "wudhsfdfahf";
		String result = maxProfit(arr,s);
		System.out.println(result);
	}
	
	public static String maxProfit(int[] arr, String s) {
		
		int minPrice = arr[0];
		int index = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] < minPrice) {
				minPrice = arr[i];
				index = i;
			}
		}
		
		int maxPrice = 0;
		for(int i = index;i<arr.length;i++) {
			if(arr[i] > maxPrice) {
				maxPrice = arr[i];
			}
		}
		
		int maxProfit = maxPrice - minPrice;
		
		//System.out.println("I am buying at RS " + minPrice + " and selling at RS " + maxPrice + " So, my total profit is RS " + maxProfit);
		
		String m = Integer.toString(maxProfit);
		m += s;
		
		char[] crr = m.toCharArray();
		LinkedList<Character> list = new LinkedList<Character>();
		for(int i =0;i<m.length();i++) {
			list.add(crr[i]);
		}
		
		for(int i =0;i<list.size();i++) {
			if((i+1)%4 == 0) {
				list.add(i, '_');
			}
		}
		String result = "";
		for(int i =0;i<list.size();i++) {
			result += list.get(i);
		}
		
		return result;
	}
}
