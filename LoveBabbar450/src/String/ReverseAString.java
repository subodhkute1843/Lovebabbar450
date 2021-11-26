package String;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		String s = "the sky is blue";
		char ch[] = new char[s.length()];
		int j = 0;
		for (int i=ch.length-1;i>=0; i--) {
			ch[i] = s.charAt(j);
			j++;
		}
		s = ch.toString();
		System.out.println(s);
	}

}
