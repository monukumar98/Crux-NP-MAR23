package Lec43;

import java.util.ArrayList;

public class HashMap<K, V> {

	class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> list;
	private int size = 0;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(null);
		}
	}

	public int hashfun(K key) {
		int indx = key.hashCode() % list.size();
		if (indx < 0) {
			indx += list.size();
		}
		return indx;

	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = list.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node node = new Node();
		node.key = key;
		node.value = value;
		temp = list.get(idx);
		node.next = temp;
		list.set(idx, node);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / list.size();
		if (lf > thf) {
			rehasing();

		}

	}

	private void rehasing() {
		// TODO Auto-generated method stub
		ArrayList<Node> ll = new ArrayList<>();
		for (int i = 0; i < 2 * list.size(); i++) {
			ll.add(null);
		}
		ArrayList<Node> old_list = list;
		list = ll;
		for (Node temp : old_list) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node temp = list.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = hashfun(key);
		Node temp = list.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = list.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			list.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;

		} else {
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
		}

	}

	@Override
	public String toString() {
		String s = "{";
		for (Node temp : list) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}
		return s + "}";
	}

}
