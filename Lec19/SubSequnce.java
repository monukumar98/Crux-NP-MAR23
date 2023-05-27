package Lec19;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSubSeq(str, "");
	}

	public static void PrintSubSeq(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch =ques.charAt(0);//a
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans+ch);

		

	}
}
