package Solution;

import java.util.LinkedList;
import java.util.Queue;

public class invertBinaryTree {
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
		      this.right = right;
		 }
	}
	class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        TreeNode temp,current;
	        if(root==null)
	            return null;
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        while(!queue.isEmpty()) {
	            current=queue.poll();
	            temp = current.left;
	            current.left = current.right;
	            current.right = temp;
	            if (current.left != null) 
	                queue.add(current.left);
	            if (current.right != null) 
	                queue.add(current.right);
	        }
	        return root;
	    }
	}
}
