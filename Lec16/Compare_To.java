package Lec16;

public class Compare_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(Compare(s1, s2));
		System.out.println(s1.compareTo(s2));

	}

	public static int Compare(String s1, String s2) {

		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) > s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();

	}

}
