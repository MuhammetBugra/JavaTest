package Solution;

public class palindromeLinkedList {
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {
	    	 
	     }
	     ListNode(int val) { 
	    	 this.val = val; 
	     }
	     ListNode(int val, ListNode next) { 
	    	 this.val = val; this.next = next; 
	     }
	 }
	 public boolean isPalindrome(ListNode head) {
		 ListNode current,prev,next,temp;
	        current=head;
	        temp=head;
	        while(temp!=null && temp.next!=null) {
	            current=current.next;
	            temp=temp.next.next;
	        }
	        prev=current;
	        current=current.next;
	        prev.next=null;
	        while(current!=null) {
	            next=current.next;
	            current.next=prev;
	            prev=current;
	            current=next;
	        }
	        temp=head;
	        current=prev;
	        while(current!=null) {
	            if(temp.val!=current.val) {
	                return false;
	            }
	            current=current.next;
	            temp=temp.next;
	        }
	        return true;
	    }
}