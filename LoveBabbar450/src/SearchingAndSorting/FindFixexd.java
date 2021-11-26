package SearchingAndSorting;

public class FindFixexd {

	public static void main(String[] args) {

		int a[] = {15, 2, 45, 4, 12, 7};
		int n = a.length;
		for(int i=0;i<n;i++) {
			if(a[i] == i+1) {
				System.out.println(a[i]);
			}
		}
	}
} 
