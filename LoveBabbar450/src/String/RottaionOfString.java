package String;

import java.util.*;

public class RottaionOfString {
	
	static boolean rotation(String s1, String s2, int a, int b) {
		if(s1.length() != s2.length()) {
			return false;
		}
		else {
			Queue<Character> q1 = new LinkedList<Character>();
			for(int i=0;i<s1.length(); i++) {
				q1.add(s1.charAt(i));
			}
			Queue<Character> q2 = new LinkedList<Character>();
			for(int i=0;i<s2.length(); i++) {
				q2.add(s2.charAt(i));
			}
			int k = q2.size();
			while(k > 0) {
				k--;
				char ch = q2.peek();
				q2.remove();
				q2.add(ch);
				if(q2.equals(q1)) {
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {

		String s1 = "ABCD";
		String s2 = "DABC";
		int a = s1.length();
		int b = s2.length();
		if(rotation(s1,s2,a,b)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}
}
