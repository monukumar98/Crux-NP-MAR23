package Lec41;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> list;

	public Heap() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	}

	public void add(int item) {
		list.add(item);
		upheapify(list.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public int remove() {
		int rv = list.get(0);
		swap(0, list.size() - 1);
		list.remove(list.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(mini) > list.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {

			swap(mini, pi);
			downheapify(mini);
		}
	}

	public int get() {
		return list.get(0);
	}

	public void Display() {
		System.out.println(list);
	}

}
