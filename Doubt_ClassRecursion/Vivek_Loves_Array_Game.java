package Doubt_ClassRecursion;

import java.util.Scanner;

public class Vivek_Loves_Array_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(Vivek_Loves(arr, 0, arr.length - 1));

		}

	}

	public static int Vivek_Loves(int[] arr, int si, int ei) {  
		for (int i = si; i < ei; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int k = si; k <= i; k++) {
				sum1 += arr[k];
			}
			for (int k = i + 1; k <= ei; k++) {
				sum2 += arr[k];
			}
			if (sum1 == sum2) {
				int left = Vivek_Loves(arr, si, i);
				int right = Vivek_Loves(arr, i + 1, ei);
				return Math.max(left, right) + 1;
			}

		}
		return 0;

	}

}
