package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(ques, ll,ans);
		System.out.println(ans);

	}

	public static void Partitioning(String ques, List<String> ll,List<List<String>> ans) {
		if (ques.length() == 0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int cut = 1; cut <= ques.length(); cut++) {
			String s = ques.substring(0, cut);
			if (Palindrome(s) == true) {
				ll.add(s);
				Partitioning(ques.substring(cut), ll,ans);
				ll.remove(ll.size() - 1);

			}
		}

	}

	public static boolean Palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
