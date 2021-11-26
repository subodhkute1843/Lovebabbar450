package Arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace {

	public static void main(String[] args) {

		int a1[] = { 1, 5, 9, 10, 15, 20 };
		int a2[] = {2, 3, 8, 13};
		
		merge(a1,a2);
		
		
	}

	static void merge(int[] a, int[] b) {

		int k = a.length-1;
		int j = 0;
		int i = 0;
		
		while(a[k] > b[j]) {
			if(a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				i++;
				Arrays.sort(b);
			}
			else if (a[i] < b[j]) {
				i++;
			}
		}
		
		for(int x : a)
			System.out.print(x+" ");
		System.out.println();
		for(int y : b)
			System.out.print(y+" ");
		
	}
}
