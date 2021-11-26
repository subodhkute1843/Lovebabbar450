package Arrays;

public class Reverse {

	public static void main(String[] args) {
		int a[] = {10,9,8,7,6,5,4,3,2,1};
		rev(0,a.length-1,a);
	}

	static void rev(int l, int r, int...a){
		while(l < r) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
