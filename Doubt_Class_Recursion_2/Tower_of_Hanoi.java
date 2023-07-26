package Doubt_Class_Recursion_2;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		toh(n, "A", "B", "C");
	}
	private static void toh(int n, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		toh(n - 1, src, des, hlp);
		System.out.println("moving ring " + n + " from " + src + " to " + des);
		toh(n - 1, hlp, src, des);
	}

}
