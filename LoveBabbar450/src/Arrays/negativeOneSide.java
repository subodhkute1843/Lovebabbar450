package Arrays;

public class negativeOneSide {

	public static void main(String[] args) {

		int a[] = {-1,-52,45,25,40,-45,-22};
		int i = 0, j = a.length-1;
		moveOneSide(a, i, j);
		print(a);
	}
	
	static void moveOneSide(int[] a, int left, int right) {
		
		while(left < right) {
			if(a[left]<0) {
				left++;
			}
			else if(a[right]>=0) {
				right--;
			}
			swap(a, left , right);
		}
	}
	
	static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
