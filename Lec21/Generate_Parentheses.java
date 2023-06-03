package Lec21;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parentheses(0, 0, "", n, ll);
		System.out.println(ll);

	}

	public static void Parentheses(int open, int close, String ans, int n,List<String> ll) {
		if (close == n && open == n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open < n) {
			Parentheses(open + 1, close, ans + "(", n,ll);
		}
		if (close < open) {
			Parentheses(open, close + 1, ans + ")", n,ll);
		}
	}

}
