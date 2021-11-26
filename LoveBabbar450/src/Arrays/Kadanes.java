package Arrays;

public class Kadanes {

	public static void main(String[] args) {
		int a[] = { -1, -2, -3, -4 };
		int n = a.length;
		System.out.println(maxSubarraySum(a, n));

	}

	static int maxSubarraySum(int[] a, int n) {

		int max = 0, maxTillNow = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = max + a[i];
			if (maxTillNow < max) {

				maxTillNow = max;
			}
			if (max < 0) {
				max = 0;
			}
		}

		return maxTillNow;
	}

}
