package helloworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListVector {
	public static void main(String[] args) {
	ArrayList country=new ArrayList();	
	country.add("Ankara");
	country.add("Yozgat");
	country.add("Kastamonu");
	country.add(1, "İstanbul");
	country.remove(2);
	Iterator itr=country.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()); }
	country.forEach(item->System.out.print(item+","));
	System.out.println();
	System.out.println("****************");
	LinkedList list=new LinkedList();
	list.add("Armut");
	list.add("Elma");
	list.add(1, "Karpuz");
	list.forEach(item->System.out.print(item+","));
	System.out.println();
	Vector v=new Vector(4,2);
	v.add("Armut");
	v.add("Elma");
	System.out.println("kapasite: "+v.capacity());
	System.out.println("boyutu: "+v.size()); } }
