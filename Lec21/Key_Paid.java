package Lec21;

public class Key_Paid {
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		KeyPaid(str, "");

	}

	public static void KeyPaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);// '1'
		String s = key[ch - '0'];
		for (int i = 0; i < s.length(); i++) {
			KeyPaid(ques.substring(1), ans + s.charAt(i));

		}

	}

}
