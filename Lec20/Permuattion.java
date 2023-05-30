package Lec20;

public class Permuattion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(PrintPermutation(str, ""));

	}

	public static int PrintPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			count += PrintPermutation(s1 + s2, ans + ch);

		}
		return count;

	}

}
