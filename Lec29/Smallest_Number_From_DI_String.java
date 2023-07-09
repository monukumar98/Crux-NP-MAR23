package Lec29;

import java.util.Stack;

public class Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Number_From_DI(s));
	}

	private static String Number_From_DI(String s) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[s.length() + 1];
		int count = 1;
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				while (!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;

				}
			} else {
				st.push(i);
			}

		}
		String str = "";
		for (int i = 0; i < ans.length; i++) {
			str = str + ans[i];
		}
		return str;
	}

}
