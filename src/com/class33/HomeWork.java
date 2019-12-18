package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		/*Create an ArrayList of cars and retrieve all the values
		 * using 3 different ways
		 */
		
		ArrayList<String> car=new ArrayList<>();
		car.add("Volkswagen");
		car.add("Subaru");
		car.add("Jeep");
		car.add("Honda");
	
		System.out.println("----1st way-----");
		for(int i=0; i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
		System.out.println("----2nd way-----");
		for(String obj1:car) {
			System.out.println(obj1);
		}
		
		System.out.println("----3rd way-----");
		Iterator it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----values backwards----");
		for (int i=car.size()-1;i>=0;i-- ) {
			System.out.println(car.get(i));
		}
		
		
	}

}
