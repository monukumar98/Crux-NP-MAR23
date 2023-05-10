package Doubt_Claass_Array_1;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		TargetSum2(arr, target);

	}

	public static void TargetSum2(int[] arr, int target) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] > target) {
				j--;
			} else if (arr[i] + arr[j] < target) {
				i++;
			} else {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}
		}
	}

	public static void TargetSum1(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(Math.min(arr[i], arr[j]) + " and " + Math.max(arr[i], arr[j]));
				}
			}
		}

	}
}
