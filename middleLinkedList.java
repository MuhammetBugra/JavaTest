package Solution;

public class middleLinkedList {
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode() {
	    	  
	    }
	    ListNode(int val) { 
	    	this.val = val; 
	    }
	    ListNode(int val, ListNode next) { 
	    	this.val = val; 
	    	this.next = next; 
	    }
	}
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        ListNode temp;
	        int a=0,i;
	        temp=head;
	        while(temp!=null) {
	            a++;
	            temp=temp.next;
	        }
	        temp=head;
	        a/=2;
	        for(i=0;i<a;i++) {
	            temp=temp.next;
	        }
	        return temp;
	    }
	}
}