package Arrays_2D_doubt_Class;

import java.util.Scanner;

public class Piyush_and_Magical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		Magical(arr, s, k);

	}

	public static void Magical(char[][] arr, int s, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (s < k) {
					System.out.println("No");
					return;
				}
				if (arr[i][j] == '.') {
					s -= 2;

				} else if (arr[i][j] == '*') {
					s += 5;

				} else {
					break;
				}
				if (j != arr[0].length - 1) {
					s -= 1;
				}

			}
		}
		if (s < k) {
			System.out.println("No");
		} 
		else {
			System.out.println("Yes");
			System.out.println(s);
		}

	}

}
