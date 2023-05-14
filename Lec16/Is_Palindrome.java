package Lec16;

public class Is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		System.out.println(Palindrome(s));

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
