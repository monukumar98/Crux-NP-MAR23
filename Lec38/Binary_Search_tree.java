package Lec38;



public class Binary_Search_tree {

	public class Node {
		int val;
		Node left;
		Node right;

	}

	private Node root;

	public Binary_Search_tree(int[] arr) {
		// TODO Auto-generated constructor stub
		root = CreateTree(arr, 0, arr.length - 1);
	}

	private Node CreateTree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = CreateTree(arr, si, mid - 1);
		nn.right = CreateTree(arr, mid + 1, ei);
		return nn;
	}
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

}
