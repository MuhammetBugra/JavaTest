package Solution;

import java.util.LinkedList;

public class smallestElementBST {
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
	    public int kthSmallest(TreeNode root, int k) {
	        LinkedList<TreeNode> list=new LinkedList<>();
	        while(true) {
	        	while(root!=null) {
		            list.push(root);
		            root=root.left;
		        }
		        root=list.pop();
		        if(--k==0)
		        	return root.val;
		        root=root.right;
	        }
	    }
	}
}
