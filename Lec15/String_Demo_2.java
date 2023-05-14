package Lec15;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = "Bye";
		int[] arr = new int[5];

		int x = arr.length;
		String s = str + str1;// String s = str.concat(str1);
//		String s1=str+"bye";// heap me aayega 
//		String s2="bye"+str1;// heap me aayega 
//		String s3 ="hello"+"bye";
//		String s4 ="hello"+"bye";
//		System.out.println(s3==s4);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(3));
	}

}
