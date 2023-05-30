package Lec20;

public class PerMuation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abca";
		PrintPermutation(str, "");
	}

	public static void PrintPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean f = true;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					f = false;
					break;
				}
			}
			if (f == true) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				PrintPermutation(s1 + s2, ans + ch);
			}

		}

	}

}
