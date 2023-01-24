package helloworld;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class linkedHashMap {
	public static void main(String[] args) {
		//LinkedHashMap ogr=new LinkedHashMap();
		TreeMap ogr=new TreeMap();
		ogr.put("Ali", 90);
		ogr.put("Veli", 80);
		Set set=ogr.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" => " +item.getValue()); } } }
