package Lec17;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		SumofTwoArray(arr1, arr2);
	}

	public static void SumofTwoArray(int[] arr1, int[] arr2) {
		ArrayList<Integer> ll = new ArrayList<>();
		int j = arr1.length - 1;
		int i = arr2.length - 1;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = arr1[j] + arr2[i] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;

		}
		while (i >= 0) {
			int sum = arr2[i] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;

		}
		while (j >= 0) {
			int sum = arr1[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry != 0) {
			ll.add(carry);
		}
		for (int k = ll.size() - 1; k >= 0; k--) {
			System.out.print(ll.get(k) + ", ");
		}
		System.out.println("END");

	}

}
