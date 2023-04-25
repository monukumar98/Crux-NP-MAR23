package Doubt_Class;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Print_Series(n1, n2);
	}

	public static void Print_Series(int n1, int n2) {
		int i = 1;
		int count = 0;
		while (count < n1) {
			int num = 3 * i + 2;
			if (num % n2 != 0) {
				System.out.println(num);
				count++;
			}
			i++;
		}
	}

}
