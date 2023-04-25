package Doubt_Class;

import java.util.Scanner;

public class Odd_and_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int car_no = sc.nextInt();
			int odd = 0;
			int even = 0;
			while (car_no > 0) {
				int rem = car_no % 10;
				if (rem % 2 == 0) {
					even += rem;
				} else {
					odd += rem;
				}
				car_no = car_no / 10;
			}
			if (odd % 3 == 0 || even % 4 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}
	}

}
