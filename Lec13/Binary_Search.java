package Lec13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		System.out.println(Search(arr, 8));
	}

	public static int Search(int[] arr, int item) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;

	}

}
