package Lec26;

public class Printprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		for (int i = 2; i <= n; i++) {
			if (isprime(i) == true) {
				System.out.println(i);
			}
		}

	}

	public static boolean isprime(int n) {
		// TODO Auto-generated method stub
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
