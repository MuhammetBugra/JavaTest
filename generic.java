package helloworld;

import java.util.ArrayList;
import java.util.HashMap;

public class generic {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		for(Integer obj:a) {
			System.out.println(obj.doubleValue()); }
		HashMap<Integer, String> c=new HashMap<>();
		c.put(1, "Adana");
		c.put(6, "Ankara");
		for(Integer key: c.keySet()) {
			System.out.println("key: "+key+" - Value: "+c.get(key)); }
		generic1<Integer> i=new generic1<Integer>(15);
		System.out.println(i.getObj());
		generic1<String> s=new generic1<String>("Ankara");
		System.out.println(s.getObj());
		generic2<Integer,String> is=new generic2<Integer,String>(66,"Yozgat");
		is.print();
		Integer[] intArr= {1,2,3,4};
		Character[] charArr= {'k','o','d'};
		genericMethod(intArr); }
	public static <E> void genericMethod(E[] dizi) {
		for(E item:dizi) {
			System.out.print(item+" "); } }
}
