package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);

		System.out.println("------find elements-------");
		
		//find element
		int size = numbers.size();
		System.out.println(size); //4

		System.out.println("-----add-------");
		
		// add more
		numbers.add(100000);
		
		System.out.println("------remove -------");
		
		
		// remove.. make sure you use index
		//numbers.remove(2);
		System.out.println(numbers);
		numbers.remove(size - 1);//3
		numbers.remove(1);
		System.out.println(numbers);
		
		System.out.println("-------retrieve value-------");
		
		//retrieve value from an ArrayList
		int element=numbers.get(0);
		System.out.println(element);
	
		System.out.println("-------for loop retrieve value-------");
		
		//retrieve values one by one 
		// 1st way - for loop
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("-----enhanced for loop retrieve value--------");
		
		//2nd way - enhance loop
		for (int num: numbers) {
			System.out.println(num);
		}
		
		System.out.println("-------values backwards-------");
		
		//retrieve values backwards
		for(int i=numbers.size()-1;i>=0;i--) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("------iterator method---------");
		
		//3 using Iterator
		Iterator<Integer>iterator=numbers.iterator(); //it will return you one object of iterator type
		
		while(iterator.hasNext()) {
			int number=iterator.next(); //autoboxing
			
			if(number%2==0) {
				System.out.println(number);
			}
			//System.out.println(iterator.next());  this is another way to print out the value 
		}
		
		
		
		
		
		

	}

}
