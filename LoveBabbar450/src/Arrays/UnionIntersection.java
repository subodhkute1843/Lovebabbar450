package Arrays;

import java.util.*;

public class UnionIntersection {

	static void Union(int a[],int b[], int m, int n) {
		Set<Integer> s = new HashSet<Integer>();
		int i=0, j=0;
		while(i<m && j<n) {
			if(a[i] <= b[j]) {
				s.add(a[i++]);
			}else {
				s.add(b[j++]);
			}
			//s.add(a[i++]);
		}
//		while(i<m) {
//			s.add(a[i++]);
//		}
//		while(j<n) {
//			s.add(b[j++]);
//		}
		System.out.println(s);
	}
	
	private static void Intersection(int[] a, int[] b, int m, int n) {
		int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j])
                i++;
            else if (b[j] < a[i])
                j++;
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }
	}
	
	public static void main(String[] args) {
		int a[] = {1, 3, 4, 5, 7};
		int b[] = {2, 3, 5, 6} ;
		int m = a.length;
		int n = b.length;
		Union(a,b,m,n);
		Intersection(a,b,m,n);
	}

	

}
