package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW {
	
	public static void main(String[] args) {
	
		Map<Integer,String> map=new TreeMap<>();
		map.put(3456, "Mac Laptop");
		map.put(6746, "HP printer");
		map.put(3468, "Dell screen");
		map.put(8853, "Samsung TV");
		map.put(1765, "Sony Camera");
		
		System.out.println(map);
		
		//to retrieve key - values using entry set
		Set<Entry<Integer,String>>set=map.entrySet();
		for (Entry<Integer,String> entry:set) {
			//System.out.println(entry.getKey()+entry.getValue());
			String element=entry.getKey()+" : "+entry.getValue();
			System.out.println(element);
		}
		
		
		System.out.println("---Retrieving key and value using iterator");
		Iterator<Entry<Integer,String>> entryIt=map.entrySet().iterator();
		while(entryIt.hasNext()) {
		Entry<Integer,String> singleEn=entryIt.next();
		System.out.println(singleEn.getKey()+" - "+singleEn.getValue());
		}
	
	
	
	
	
	}
}
