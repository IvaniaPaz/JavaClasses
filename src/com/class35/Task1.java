package com.class35;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		Map<String, String> map1=new TreeMap<>();
		map1.put("El Salvador", "San Salvador");
		map1.put("USA", "Washington, DC");
		map1.put("Spain", "Madrid");
		map1.put("Colombia", "Bogota");

		System.out.println("--using for each-----");
		Set<String> KV=map1.keySet();
		for(String key:KV) {
			System.out.println(key+":"+map1.get(key));
		}
	System.out.println("-- using iterator---");
	Iterator<String> counIt=KV.iterator();
	while(counIt.hasNext()) {
		String mapkey=counIt.next();
		String mapval=map1.get(mapkey);
		System.out.println(mapkey+":"+mapval);
	}
	
	
	
	
	
	
	
	}
}
