package Lec46;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(HouseRobber(arr, 0));
		System.out.println(HouseRobberTD(arr, 0, dp));
	}

	public static int HouseRobber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int rob = arr[i] + HouseRobber(arr, i + 2);
		int Dont_rob = HouseRobber(arr, i + 1);
		return Math.max(rob, Dont_rob);

	}

	public static int HouseRobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {

			return dp[i];
		}
		int rob = arr[i] + HouseRobberTD(arr, i + 2, dp);
		int Dont_rob = HouseRobberTD(arr, i + 1, dp);
		return dp[i] = Math.max(rob, Dont_rob);

	}
}
