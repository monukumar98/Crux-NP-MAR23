package Doubt_ClassRecursion;

import java.util.Scanner;

public class Subset_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println("\n" + SubSet(arr, 0, "", target, 0));

	}

	public static int SubSet(int[] arr, int i, String ans, int target, int sum) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return 1;
			}
			return 0;
		}

		int a = SubSet(arr, i + 1, ans + arr[i] + " ", target, sum + arr[i]);
		int b = SubSet(arr, i + 1, ans, target, sum);
		return a + b;

	}

}
