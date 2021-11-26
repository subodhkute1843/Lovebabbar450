package Arrays;

public class LargestSum {

	public static void main(String[] args) {
		int [] a = {-1,-2,-3,-4};
		int n = a.length ;
		int count = 0, max = a[0];
		for(int i=0;i<n;i++) {
			count += a[i];
			if(count < 0) {
				count = 0;
			}
			if(count > max) {
				max = count;
			}
		}
		
		System.out.println(max);
	}

}
