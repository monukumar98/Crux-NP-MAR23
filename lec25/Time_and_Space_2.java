package lec25;

public class Time_and_Space_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		System.out.println("Hello");
		int n = 10000;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
//O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// O(log(n))
			i *= 2;
		}
		while (n > 0) {
			// O(log(n))
			System.out.println("Hey");
			n /= 2;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) Base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)) Base 6
			n /= 2;
			n /= 3;
		}
		int k = 1;
		while (i <= n) {
			System.out.println("Hey");
			// O(n/k)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) Base k
			i *= k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}

		for (i = 1; i * i <= n; i++) {
			// O(sqrt(N))
			System.out.println("hey");
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (k = 1; k <= 1000; k++) {
					// (O)(1000*N^2)

				}
			}
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4))
				}
			}
		}

		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// O(Log(N))
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					// O(N^2*log))
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}
		for (int j = 0; j < n; j++) {

		}

	}

}
