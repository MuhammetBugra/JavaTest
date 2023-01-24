package helloworld;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
	public static void main(String[] args) {
	Queue q=new LinkedList();
	q.add("Deniz");
	q.add("Mehmet");
	q.offer("Ali");
	System.out.println("remove: "+q.remove());
	System.out.println("element: "+q.element());
	System.out.println("peek: "+q.peek());
	System.out.println("poll: "+q.poll());
	q.forEach(i -> System.out.println(i));
} }
