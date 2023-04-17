package Lec9;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int[] arr = new int[5];
		//int arr1[] = new int[5];
		System.out.println(a);
		System.out.println(arr);
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 50;
		System.out.println("*************");
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] other = arr;
		System.out.println(arr[5]);
	}

}
