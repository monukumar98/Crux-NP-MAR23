package Doubt_ClassRecursion;

import java.util.Scanner;

public class Split_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		SubSet(arr, 0, "", 0, "", 0);
	}

	public static void SubSet(int[] arr, int i, String ans1, int sum1, String ans2, int sum2) {
		if (i == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);
			}
			return;
		}
		SubSet(arr, i + 1, ans1 + arr[i] + " ", sum1 + arr[i], ans2, sum2);
		SubSet(arr, i + 1, ans1, sum1, ans2 + arr[i] + " ", sum2 + arr[i]);
	}

}
