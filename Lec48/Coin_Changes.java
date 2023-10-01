package Lec48;

public class Coin_Changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coin.length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(Coinchanges(coin, amount, 0, dp));
		System.out.println(CoinchangesBU(coin, amount));
	}

	public static int Coinchanges(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}

		int inc = 0, exc = 0;
		if (amount >= coin[i]) {
			inc = Coinchanges(coin, amount - coin[i], i, dp);
		}
		exc = Coinchanges(coin, amount, i + 1, dp);
		return dp[amount][i] = inc + exc;
	}

	public static int CoinchangesBU(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length+1];
		for (int i = 0; i < dp[0].length; i++) {

			dp[0][i] = 1;
		}
		for (int i = 1; i <= amount; i++) {// col
			for (int j = 1; j < dp[0].length; j++) {// row
				int inc = 0, exc = 0;
				if (i >= coin[j - 1]) {
					inc = dp[i - coin[j - 1]][j];
				}
				exc = dp[i][j - 1];

				dp[i][j] = inc + exc;
			}

		}
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

}
