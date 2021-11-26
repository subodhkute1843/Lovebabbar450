package Matrix;

public class RotateAntiClockwise {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int n = a.length;
		printM(a,n);
		//transpose the matrix
		transpose(a,n);
		System.out.println();
		printM(a,n);
		//reverse the rows 
		rev(a,n);
		System.out.println();
		printM(a,n);
	}
	
	static void rev(int a[][], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0,k=a.length-1; j<k; j++,k--) {
				int temp = a[j][i];
				a[j][i] = a[k][i];
				a[k][i] = temp;
			}
		}
	}
	
	static void transpose(int a[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}
	
	static void printM(int a[][], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
