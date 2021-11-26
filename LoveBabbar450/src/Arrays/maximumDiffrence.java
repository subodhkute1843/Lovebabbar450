package Arrays;

//Maximum Difference Between Increasing Elements 
//leetcode


public class maximumDiffrence {

	public static void main(String[] args) {
		int a[] = {1,5,2,10};
		int n =a.length;
		maximumDiff(a,n);

	}

	private static void maximumDiff(int[] a, int n) {
		
		int diff = Integer.MIN_VALUE;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				diff = Math.max(diff, a[i] - a[j]);
			}
		}
		
		if(diff<=0) {
			System.out.println(-1);
		}else {
		System.out.println(diff);
		}
	}

}
