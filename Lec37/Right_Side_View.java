package Lec37;

import java.util.*;

public class Right_Side_View {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;

		}
	}

	class Solution {
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightSide(root, 1, ll);
			return ll;
		}

		int max_Dept = 0;

		public void rightSide(TreeNode root, int curr_level, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (max_Dept < curr_level) {
				ll.add(root.val);
				max_Dept = curr_level;

			}
			rightSide(root.right, curr_level + 1, ll);
			rightSide(root.left, curr_level + 1, ll);

		}
	}
}
