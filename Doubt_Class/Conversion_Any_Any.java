package Doubt_Class;

import java.util.Scanner;

public class Conversion_Any_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int num = sc.nextInt();
		int ans1 = Src_dec(num, sb);
		System.out.println(dec_Db(ans1, db));
	}

	public static int Src_dec(int num, int sb) {
		int ans1 = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % 10;
			ans1 = ans1 + rem * mul;
			mul = mul * sb;
			num = num / 10;

		}
		return ans1;
	}

	public static int dec_Db(int num, int db) {
		int ans1 = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % db;
			ans1 = ans1 + rem * mul;
			mul = mul * 10;
			num = num / db;

		}
		return ans1;
	}
}
