package Arrays;

public class MinimumJumps {

	public static void main(String[] args) {

		int	a[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		int n = a.length, i=0;
		int count = 0;
		while(i<n) {
			int max = 0;
			for(int j=i; j<=i+a[i];j++) {
				if(max < a[j]) {
					max = a[j];
				}
				i = i + max;
			}
			
			count++;
		}
	
		System.out.println(count);
	}

}
