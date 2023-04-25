package Doubt_Class;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			ShoppingGame(n, m);
			t--;
		}

	}

	public static void ShoppingGame(int n, int m) {
		int a = 0;
		int h = 0;
		int count = 1;
		while (true) {
			a = a + count;
			if (a > n) {
				System.out.println("Harshit");
				break;
			}
			count++;
			h += count;
			if (h > m) {
				System.out.println("Aayush");
				break;
			}
			count++;
		}

	}

}
