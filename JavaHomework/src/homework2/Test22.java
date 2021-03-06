package homework2;

import java.util.HashMap;
import java.util.Map;

public class Test22 {
	public static void main(String[] args) {
		String str = "123545rtyuiewwer21q3q2r2qrqrq23aewqt3qr35y2yhw";
		longestNodupSubstring(str);
	}
	
	public static void longestNodupSubstring(String string) {
		int len = string.length();
		if(len > 0){
			Map<Character,Integer> cursor = new HashMap<Character,Integer>();
			cursor.put(string.charAt(0),0);
			int[] lengthAt = new int[string.length()];
			lengthAt[0]=1;
			int max = 0 ;
			for(int i = 1 ; i < len;i++){
				char c =string.charAt(i);
				if(cursor.containsKey(c)){
					lengthAt[i] = Math.min(lengthAt[i-1]+1, i-cursor.get(c));
				}else {
					lengthAt[i] = lengthAt[i-1]+1;
				}
				max = Math.max(max, lengthAt[i]);
				cursor.put(c, i);
			}	
			for(int i=0;i<len;i++){
				if(max == lengthAt[i]){
					System.out.println(string.substring(i-max+1, i+1));
				}
			}
		}
	}

}
