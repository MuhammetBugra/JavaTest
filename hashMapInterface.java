package helloworld;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapInterface {
	public static void main(String[] args) {
		HashMap b=new HashMap();
		b.put("Türkiye","Ankara");
		b.put("Türkiye","İstanbul");
		b.put("İngiltere", "Londra");
		Set s=b.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" => "+item.getValue()); } } }
