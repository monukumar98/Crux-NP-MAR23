package Doubt_Class_2;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Circular_Sum(arr));

			t--;
		}

	}

	public static int Circular_Sum(int[] arr) {

		int linearmaxsum = Kadanes(arr);
		// total sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int midpart = Kadanes(arr);
		sum += midpart;// circular sum

		if (sum == 0) {
			return linearmaxsum;
		}
		return Math.max(linearmaxsum, sum);

	}

	public static int Kadanes(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}

		}
		return ans;

	}

}
