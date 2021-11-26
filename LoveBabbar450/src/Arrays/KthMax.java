package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthMax {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int a[] = {10,9,8,7,5,2,4,6,3};
		int k = scan.nextInt();
		kthMaxMin(a, k);
	}
	
	static void kthMaxMin(int a[], int k) {
		
		Arrays.sort(a);
		for(int i =0;i<a.length; i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a);
		System.out.println("kth max"+a[a.length-k-1]);
		System.out.println("kth min"+a[k-1]);
		
	}

}
