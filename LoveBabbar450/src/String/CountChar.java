package String;

public class CountChar {

	public static void main(String[] args) {
		final int charCount = 128;
		
		String s = "test string";
		int a[] = new int[charCount];
		
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)]++;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] >= 1) {
				System.out.println((char)(i) + " count, "+a[i]);
			}
		}
	}
	

}
