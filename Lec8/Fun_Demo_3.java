package Lec8;

public class Fun_Demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bye");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(add(a, b));
		System.out.println(val);
	}

	public static int add(int a, int b) {

		int c = a + b;
		// System.out.println(sub());
		// System.out.println(c);
		int val = 90;
		System.out.println(val);
		Fun_Demo_3.val = val + 5;
		return c;
	}
}
