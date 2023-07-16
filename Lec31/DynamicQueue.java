package Lec31;

import Lec30.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				newarr[i] = arr[idx];

			}
			arr = newarr;
			front = 0;
		}
		super.Enqueue(item);

	}

	public static void main(String[] args) throws Exception {

		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Display();

	}

}
