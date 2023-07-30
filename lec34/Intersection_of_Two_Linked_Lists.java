package lec34;

public class Intersection_of_Two_Linked_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode r = headA;
			ListNode v = headB;
			while (r != v) {
				if (r == null) {
					r = headB;
				} else {
					r = r.next;
				}
				if (v == null) {
					v = headA;
				} else {
					v = v.next;
				}

			}
			return r;

		}
	}

}
