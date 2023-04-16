package Lec8;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Armstrong_Number(n));

	}

	public static boolean Armstrong_Number(int n) {
		int cod = Countofdigit(n);
		int sum = 0;
		int p=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n = n / 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}

	}

	public static int Countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
