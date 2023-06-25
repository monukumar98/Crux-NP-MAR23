package Lec26;

import java.util.Arrays;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		Sieve_algo(n);

	}

	public static void Sieve_algo(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == true) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[i * j] = false;
				}
			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == true) {
				System.out.print(i + " ");
			}
		}

	}

}
