package Arrays;

import java.util.Arrays;

public class MaxMin {
	
	public static void main(String[] args) {
		int a[] = {10,9,8,7,6,5,4,3,2,1};
		//Arrays.sort(a);
		//System.out.println(a[0]+" "+a[a.length-1]);
		maxMin(a);
	}

	static void maxMin(int a[]) {
		int min = 11;
		int max = -1;
		for(int i=0;i<a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if(a[i] > max)
				max= a[i];
		}
		System.out.println("max "+ max+" min "+min);
		
	}
}
