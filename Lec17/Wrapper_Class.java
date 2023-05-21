package Lec17;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii = 90;
		int i = 89;
		System.out.println(ii);
		System.out.println(i);
		Long ll = 878l;
		Short s = 18;
		// auto-boxing
		ii = i;
		Integer a = 100;
		int b = 10;
		b = a;// Integer --> int on-boxing
		System.out.println(i);

		Integer x = 18;
		Integer x1 = 18;
		Integer y = 189;
		Integer y1 = 189;
		System.out.println(x==x1);
		System.out.println(y==y1);
		Long l1 = 12l;
		Long l2 = 12l;
		System.out.println(l1 == l2);

	}

}
