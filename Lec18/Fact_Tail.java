package Lec18;

public class Fact_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fact(4, 1));

	}

	public static int Fact(int n, int ans) {
		if (n == 1) {
			return ans;
		}

		return Fact(n - 1, ans * n);
	}

}
