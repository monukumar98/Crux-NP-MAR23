package Lec32;

import java.util.*;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 6, 7, 8, 1, 9, 10, 19, 3 };
		NGE(arr);
	}
	public static void NGE(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);

		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}

}
