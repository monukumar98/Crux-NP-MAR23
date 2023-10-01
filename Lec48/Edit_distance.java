package Lec48;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "FOOD";
		String s2 = "MONEY";
		System.out.println(Editdistance(s1, s2, 0, 0));

	}

// i-->s1 j-->s2
	public static int Editdistance(String s1, String s2, int i, int j) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}

		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = Editdistance(s1, s2, i + 1, j + 1);//dp[i-1][j-1]
		} else {
			int D = Editdistance(s1, s2, i + 1, j);//dp[i-1][j]
			int I = Editdistance(s1, s2, i, j + 1);//dp[i][j-1]
			int R = Editdistance(s1, s2, i + 1, j + 1);//dp[i-1][j-1]
			ans = Math.min(D, Math.min(I, R)) + 1;
		}
		return ans;
	}

}
