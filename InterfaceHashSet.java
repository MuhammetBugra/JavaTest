package helloworld;

import java.util.*;

public class InterfaceHashSet {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.clear();
		h.add("12 str");
		h.add(12);
		h.add(12.0);
		h.add(12.0);
		h.add(true);
		h.add(null);
		h.remove(12);
		System.out.println(h.size());
		System.out.println(h.contains(12));
		Iterator itr=h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); }
		System.out.println("**************");
		LinkedHashSet gunler=new LinkedHashSet();
		gunler.add("Pazartesi");
		gunler.add("Salı");
		gunler.add("Çarşamba");
		gunler.add("Perşembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		gunler.add("Pazartesi");
		gunler.forEach(item->System.out.print(item+","));
		System.out.println();
		System.out.println("**************");
		TreeSet tree=new TreeSet();
		tree.add(10);
		tree.add(1);
		tree.add(5);
		try {
			tree.add(null); }
		catch (Exception e) {
			System.out.println(e.toString()); }
		tree.forEach(item->System.out.print(item+","));
} }
