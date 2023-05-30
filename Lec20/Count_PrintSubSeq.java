package Lec20;

public class Count_PrintSubSeq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
//		PrintSubSeq(str, "");
//		System.out.println(count);
		System.out.println(CountSubSeq(str, ""));
	}

	static int count = 0;

	public static void PrintSubSeq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = ques.charAt(0);// a
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans + ch);

	}

	public static int CountSubSeq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");

			return 1;
		}
		char ch = ques.charAt(0);// a
		int a = CountSubSeq(ques.substring(1), ans);
		int b = CountSubSeq(ques.substring(1), ans + ch);
		return a + b;

	}

}
