package Lec40;

public class Genrics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 40, 50, 60 };
		Display(arr);
		String[] arr1 = { "Rajat Bklol", "Ramu", "Ankita", "Kunal" };
		Display(arr1);

	}

	public static <T> void Display(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
