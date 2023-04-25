package Doubt_Class;

import java.util.Scanner;

public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long mul = 1;
		long sum = 0;
		if (n == 0) {
			System.out.println(5);
			return;
		}
		while (n > 0) {
			int rem = (int) (n % 10);
			if (rem == 0) {
				sum = sum + 5 * mul;
			} else {
				sum = sum + rem * mul;
			}
			n = n / 10;
			mul = mul * 10;
		}
		System.out.println(sum);

	}

}
