
package Arrays;

public class Sort012 {

	public static void main(String[] args) {

		Sort012 sort = new Sort012();
		
		int a[] = {0,0,1,2,1,0,1,2,0,1,2};
		int mid = 0;
		int l = 0;
		int r = a.length-1;
		while(mid <= r) {
			
			switch(a[mid]) {
			case(0):
				sort.swap(a, l ,mid);
				l++;
				mid++;
				break;
			case(1):
				mid++;
				break;
			case(2):
				sort.swap(a, mid, r);
				r--;
				break;
			}
		}
		
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x]+" ");
		}
	}
	
	void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
