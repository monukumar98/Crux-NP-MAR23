package Lec31;

import Lec30.Stack;

public class DynamicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (super.isfull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(item);

	}

}
