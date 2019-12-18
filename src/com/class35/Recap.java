package com.class35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Recap {

	public static void main(String[] args) {
		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(59.99);
		set.add(39.99);
		set.add(19.99);

		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
			Double d = iterator.next();
			if (d < 50) {
				iterator.remove();
			}
		}

		for (Double d1 : set) {
			System.out.println(d1);
		}
		
		
List<String>alist=new ArrayList<>();
alist.add("john");
alist.add("jane");
alist.add("james");
alist.add("jasmine");
alist.add("jane");
alist.add("james");

Set<String> hset=new HashSet<>();
hset.addAll(alist);
System.out.println(hset);
		
alist.clear();
System.out.println(alist);
alist.addAll(hset);
System.out.println(alist);
		
////////////////////////////////////

// how can I access/update just 1 value from the set collection
	Set<String> lset=new HashSet<>();//keep the order	
	lset.add("Morning");
	lset.add("Noon");
	lset.add("Evening");
	lset.add("Night");
	
	//convert to the array list 
	List<String> mylist=new ArrayList<>();
	mylist.addAll(lset);
	String element=mylist.get(2);
	System.out.println(element);
	
	// another way to create an object of arraylist by passing values to the constance
	List<String> mylist1=new ArrayList<>();
	
	
	
	
	
	
	
	
	}
}
