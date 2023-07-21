package Doubt_ClassRecursion;

import java.util.Scanner;

public class Mapped_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Mapped(s, "");
	}

	public static void Mapped(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		String s1 = str.substring(0, 1);
		int a = Integer.parseInt(s1);
		char ch = (char) (64 + a);
		Mapped(str.substring(1), ans + ch);
		if (str.length() >= 2) {
			s1 = str.substring(0, 2);
			a = Integer.parseInt(s1);
			if (a <= 26) {
				ch = (char) (64 + a);
				Mapped(str.substring(2), ans + ch);
			}
		}

	}

}
