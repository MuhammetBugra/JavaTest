package Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
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
		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> list=new ArrayList<>();
	        List<Integer> subList=new ArrayList<>();
	        Queue<TreeNode> queue = new LinkedList<>();
	        TreeNode current;
	        int number,i;
	        if(root == null) 
	            return list;
	        queue.add(root);
	        while(!queue.isEmpty()) {
	            number=queue.size();
	            for(i=0;i<number;i++) {
	                current=queue.poll();
	                subList.add(current.val);
	                if(current.left!=null)
	                    queue.add(current.left);
	                if(current.right!=null)
	                    queue.add(current.right);
	            }
	            list.add(new ArrayList<>(subList));
	            subList=new ArrayList<>();
	        }
	        return list;
	    }
	}
}
