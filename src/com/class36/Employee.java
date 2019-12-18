package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {

//	Create a Map that will store Employee name and salary.
//	Write a logic to retrieve an employee who gets the highest salary. 
//	Output should be in the below format
//	John Smith=$100000
	public static void main(String[] args) {
		

	Map<String,Integer> employee= new LinkedHashMap<>();
	employee.put("John", 100000);
	employee.put("Jane", 150000);
	employee.put("James", 90000);
	employee.put("Jack", 350000);
	
	int highestSal=0;
	Collection<Integer> salary=employee.values();
	for(Integer s:salary) {
		if(s>=highestSal) {
			highestSal=s;
		}
	}
	
	Set<String> set=employee.keySet();
	for(String key:set) {
		if(employee.get(key)==highestSal) {
			System.out.println(key+"="+highestSal);
		}
	}
}
}