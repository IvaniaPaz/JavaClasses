package com.class35;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
    
        
        /* MY CODE 
         */
        
        
Set<String> keys = map.keySet();
		
		for (String key : keys) {
			int size;
			size=keys.size();
			System.out.println(size);
			break;
		}
		map.clear();
		
		Set<String> keys1=map.keySet();
		for(String key1:keys1) {
			int size;
			size=keys1.size();
			System.out.println(size);
			break;
		}
		System.out.println("0");
	}
}
