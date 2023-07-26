package Doubt_Class_Recursion_2;

public class Remove_Replace_hi_Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abchihitfhi";
		System.out.println(count(s));
		remove(s, "");
		repalce(s, "");
	}

	public static void remove(String s, String ans) {

		if (s.length() <= 1) {
			System.out.println(ans + s);
			return;
		}
		String str = s.substring(0, 2);

		if (!str.equals("hi")) {
			remove(s.substring(1), ans + s.charAt(0));

		} else if (str.equals("hi") && s.length() >= 3 && s.charAt(2) == 't') {

			remove(s.substring(3), ans + s.substring(0, 3));

		} else {
			remove(s.substring(2), ans);
		}

	}

	public static int count(String s) {

		if (s.length() <= 1) {
			return 0;
		}
		int ans = 0;
		String s1 = s.substring(0, 2);
		if (!s1.equals("hi")) {
			ans = ans + count(s.substring(1));
		} else if (s1.equals("hi") && s.length() >= 3 && s.charAt(2) == 't') {
			ans = ans + count(s.substring(3));
		} else {
			ans = ans + 1 + count(s.substring(2));
		}
		return ans;

	}

	public static void repalce(String s, String ans) {

		if (s.length() <= 1) {
			System.out.println(ans + s);
			return;
		}
		String str = s.substring(0, 2);

		if (!str.equals("hi")) {
			repalce(s.substring(1), ans + s.charAt(0));

		} else if (str.equals("hi") && s.length() >= 3 && s.charAt(2) == 't') {

			repalce(s.substring(3), ans + s.substring(0, 3));

		} else {
			repalce(s.substring(2), ans + "bye");
		}

	}
}
