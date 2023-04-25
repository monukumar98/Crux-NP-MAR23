package Doubt_Class;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		long mul = 1;
		while (n > 9) {
			int rem = (int) (n % 10);
			if (rem >= 5) {
				sum = sum + (9 - rem) * mul;
			} else {
				sum = sum + rem * mul;
			}
			n = n / 10;
			mul = mul * 10;
		}
		if (n == 9) {
			sum = sum + 9 * mul;
		}
		else if (n >= 5) {
			sum = sum + (9 - n) * mul;
		}
		else {
			sum = sum + n * mul;
		}
		System.out.println(sum);
	}

}
