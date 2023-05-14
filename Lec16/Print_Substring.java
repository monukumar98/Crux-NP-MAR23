package Lec16;

public class Print_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		PrintAllString(s);

	}

	public static void PrintAllString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.print(s.substring(i, j)+" ");
			}
		}

	}

}
