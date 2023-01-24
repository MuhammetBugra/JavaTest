package helloworld;

import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue();
	q.add(80);
	q.add(20);
	q.add(50);
	while(!q.isEmpty()) {
		System.out.println(q.poll()); }
} }