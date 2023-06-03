package Lec21;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 3;
		printpath(0, 0, n - 1, m - 1, "");

	}

	public static void printpath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && ec == cc) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		printpath(cr, cc + 1, er, ec, ans + "H");
		printpath(cr + 1, cc, er, ec, ans + "V");

	}

}
