package Solution;

public class reverseLinkedList {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { 
			 this.val = val; 
		 }
		 ListNode(int val, ListNode next) {
			 this.val = val; 
			 this.next = next; 
		 }
	}
	public ListNode reverseList(ListNode head) {
        ListNode current,prev,next;
        current=head;
        prev=null;
        while(current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
