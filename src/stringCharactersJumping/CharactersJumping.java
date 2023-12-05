package stringCharactersJumping;

public class CharactersJumping {
	public static void main(String[] args) {
		String s = "abc";
		int target = 4;
		
		System.out.println(jump(s,target));
	}
	
	public static String jump(String s, int target) {
		
		StringBuilder sb = new StringBuilder();
		char[] crr = s.toCharArray();
		
		for(int i = 0;i<crr.length;i++) {
			int num = (int)(crr[i]);
			sb.append((char)(num + target));
		}
		
		String result = sb.toString();
		return result;
	}
}
