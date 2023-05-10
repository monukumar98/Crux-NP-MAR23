package Doubt_Claass_Array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {

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
			int target = sc.nextInt();
			Pairofrose(arr, target);
			t--;
		}
	}

	public static void Pairofrose(int[] arr, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		int diff = Integer.MAX_VALUE;
		int p1 = 0;
		int p2 = 0;
		while (i < j) {
			if (arr[i] + arr[j] > target) {
				j--;
			} else if (arr[i] + arr[j] < target) {
				i++;
			} else {
				if (diff > arr[j] - arr[i]) {
					p1 = arr[i];
					p2 = arr[j];
					diff = arr[j] - arr[i];
				}
				i++;
				j--;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + p1 + " and " + p2 + ".");
	}

}
