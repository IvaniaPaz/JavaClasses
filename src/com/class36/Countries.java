package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Countries {
//	Create a Map from array of cities that will sort keys in alphabetical order. 
//	As a key store the name of the city and as a value store the length of the city 
//	(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city ( use Iterator ). 
	public static void main(String[] args) {

		Map<String, Integer> cities = new TreeMap<>();
		cities.put("New York", 10);
		cities.put("Washington, DC", 15);
		cities.put("Falls Church", 7);
		cities.put("Paris", 5);
		cities.put("Madrid", 9);

		cities.entrySet().removeIf(letter -> letter.getValue() > 7);

		Set<Entry<String, Integer>> entrySet = cities.entrySet();
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Entry<String, Integer> outPut = entryIt.next();
			System.out.println(outPut.getKey() + ":" + outPut.getValue());
		}
	}
}