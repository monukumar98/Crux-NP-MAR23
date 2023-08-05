package Lec35;

public class Cycle_removal {

	public class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	public int size;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;

		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k to sahi deta ");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() throws Exception {
		tail.next = getNode(2);

	}

	public Node HasCycle() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}

		}
		return null;
	}

	public void removalCycle1() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		while (slow != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == slow) {
					temp.next = null;
					return;
				}
				temp = temp.next;

			}
			slow = slow.next;
		}

	}

	public void removalCycle2() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		// length of cycle
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;

		}
		// fast ko move kra do m distance
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		// cycle removal
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void floyedCycle() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_removal cy = new Cycle_removal();
		cy.addLast(1);
		cy.addLast(2);
		cy.addLast(3);
		cy.addLast(4);
		cy.addLast(5);
		cy.addLast(6);
		cy.addLast(7);
		cy.addLast(8);
		cy.Display();
		cy.CreateCycle();
		cy.removalCycle1();
		cy.Display();

	}

}
