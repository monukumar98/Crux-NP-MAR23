package Lec39;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

	}

	private TreeNode root;

	public Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		TreeNode nn = new TreeNode();
		nn.val = item;
		root = nn;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			TreeNode rv = q.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				TreeNode node = new TreeNode();
				node.val = c1;
				rv.left = node;
				q.add(node);

			}
			if (c2 != -1) {
				TreeNode node = new TreeNode();
				node.val = c2;
				rv.right = node;
				q.add(node);

			}

		}

	}
	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(TreeNode node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.val + " ");

	}


	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Level_Order lv = new Level_Order();
		lv.POStOrder();
	}
	
}
