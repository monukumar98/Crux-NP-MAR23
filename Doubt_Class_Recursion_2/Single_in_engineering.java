package Doubt_Class_Recursion_2;

import java.util.Arrays;
import java.util.Scanner;

public class Single_in_engineering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int wood = sc.nextInt();
		System.out.println(max(arr, wood));

	}

	public static int max(int[] arr, int wood) {
		int lo = 0;
		int hi = arr[arr.length - 1];
		
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(arr, wood, mid)) {
				ans = mid;
				lo = mid + 1;
				System.out.println("ans "+ ans);
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

	private static boolean isitpossible(int[] arr, int wood, int mid) {
		// TODO Auto-generated method stub
		int cut = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mid) {
				cut = cut + (arr[i] - mid);
			}
			if (cut >= wood) {
				
				return true;
			}
		}
		return false;
	}

}
