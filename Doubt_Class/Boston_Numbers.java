package Doubt_Class;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Boston(n);
	}
	public static void Boston(int n) {
		int sum1 = Sumofdigit(n);
		int sum2 = 0;
		int i = 2;
		while (i <= n) {
			while (n % i == 0) {
				sum2 += Sumofdigit(i);
				n = n / i;

			}
			i++;
		}
		if (sum1 == sum2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static int Sumofdigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;// sum = sum +rem
			n = n / 10;

		}
		return sum;

	}
}
