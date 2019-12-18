package com.class36;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
//		Create a Person class with following private fields: name, lastName, age, salary. 
//		Variables should be initialized through constructor.
//		Inside the class also create a method to print user details.
//		In Test Class create a Map that will store key in ascending order.
//		In that map store personId and a Person Object. Print each object details.	

		Map<Integer, Person> personMap = new LinkedHashMap<>();
		personMap.put(123, new Person("John", "Doe", 32, 45000));
		personMap.put(345, new Person("Jane", "Doe", 28, 100000));
		personMap.put(678, new Person("Jax", "Sorto", 45, 250000));
		personMap.put(910, new Person("Jack", "Smith", 50, 150000));

		System.out.println(personMap.size());

		Set<Entry<Integer, Person>> set = personMap.entrySet();
		for (Entry<Integer, Person> entry : set) {
			entry.getValue().userDetails();
		}

	}
}
