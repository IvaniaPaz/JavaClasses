package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		/*
		 * find the largest from 300 and 500 then identify if the largest number
		 * 
		 */

		AllMethods obj = new AllMethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);
		System.out.println("---------------");
		AllMethods obj1 = new AllMethods();
		boolean odd = obj1.isOdd(large);
		System.out.println(odd);
		System.out.println("---------------");
		
		/*call method weekDayName
		 * if(Tues,wed,thurs,sat,sun) learning JAVA
		 */
		
		String day=obj.weekDayName(5);
		if(day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")
				||day.equals("Saturday")|| day.equals("Sunday")) {
			System.out.println("I am leaning Java");
		}else {
			System.out.println("I am practicing Java");
		}

	}

}
