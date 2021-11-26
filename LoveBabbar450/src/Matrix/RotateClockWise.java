package Matrix;

import java.util.Scanner;

public class RotateClockWise {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of the matrix");
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		
		//taking input from user
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		//transpose matrix
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				swap(a,i,j);
			}
		}
		
		//print transposed matrix
		System.out.println();
		print(a,n);
		
		
		//reverse the rows
		for(int i=0;i<n;i++) {
			rev(a[i]);
		}
		
		//print rotated matrix
		System.out.println();
		print(a,n);
		
	}
	
	static void rev(int a[]) {
		int i=0, j=a.length-1;
		while(i<=j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
	
	private static void print(int[][] a,int  n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print( a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	//swap
	static void swap(int[][] a, int i, int j) {
		int temp = a[i][j];
		a[i][j] = a[j][i];
		a[j][i] = temp;
	}
	

}
