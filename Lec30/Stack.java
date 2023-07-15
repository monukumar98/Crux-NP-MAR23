package Lec30;

public class Stack {

	private int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public boolean isfull() {
		return idx == arr.length - 1;
	}

	public void push(int item) throws Exception{
		if (isfull()) {
			throw new Exception("Rajat bklol stack full hai ");
		}
		idx++;
		this.arr[idx] = item;
	}

	public int size() {
		return idx + 1;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Rajat bklol stack Empty hai ");
		}
		int rv = arr[idx];
		idx--;
		return rv;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Rajat bklol stack Empty hai ");
		}
		int rv = arr[idx];
		return rv;

	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + "-->");
		}
		System.out.println();
	}

}
