package Lec11;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] ans = product(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	public static int[] product(int[] arr) {
		int[] left = new int[arr.length];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		int[] right = new int[arr.length];
		right[arr.length - 1] = 1;
		for (int i = right.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < right.length; i++) {
			arr[i] = left[i] * right[i];
		}
		return arr;

	}

}
