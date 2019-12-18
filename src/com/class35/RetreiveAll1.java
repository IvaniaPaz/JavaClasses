package com.class35;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetreiveAll1 {

	public static void main(String[] args) {
		// let's create a map of classroom in which we will store objects and it's quality
		
		Map<String, Integer> classRoom=new HashMap<>();
		classRoom.put("Instructor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chair", 80);
	
		System.out.println(classRoom);
	Set<Entry<String, Integer>> entrySet=classRoom.entrySet(); //entry set will return your collection set
	System.out.println("---- using for each loop to get all entry objects");
	
	for(Entry<String,Integer>entry:entrySet) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
	System.out.println("---- using iterator to get all entry objects");
	Iterator<Entry<String, Integer>> entryIt=entrySet.iterator();
	while(entryIt.hasNext()) {
		Entry<String, Integer> ent=entryIt.next();
		String entry=ent.getKey()+"--"+ent.getValue();
		System.out.println(entry);
	}
	
	
	
	
	
	
	}
}
