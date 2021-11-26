package Arrays;

public class CylindricallyRotate {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int n = a.length;
		int x = a[n-1];
		for(int i=a.length-1;i>=1; i--) {
			a[i] = a[i-1];
		}
		a[0] = x;
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
