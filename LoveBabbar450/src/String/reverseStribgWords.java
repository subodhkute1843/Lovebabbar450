package String;

import java.util.StringTokenizer;

public class reverseStribgWords {

	public static void main(String[] args) {
		
		String s = "the sky is blue";
		String newStr = "";
		int j = s.length()-1;
		for(int i=s.length()-1; i>=0; i--) {
			
			if (s.charAt(i) == ' ' && i>0) {
				newStr = newStr.concat(s.substring(i, j));
				j = i;
			}
				
		}
		System.out.println(newStr);
		
	}

}
