package com.class06;

import java.util.Scanner;

public class TaskExample {

	public static void main(String[] args) {
		/*Ask user to enter the month they were born
		 * based on the month define the season
		 * if user is born in jan,feb, dec---> winter 
		 *if mar, apr, may --->spring
		 *if jun,jul, aug ---> summer
		 *if sep,oct, no ----->fall
		 *otherwise ---> unknown 
		 *at the end of the program "You were born in___"
		 */
		String month;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the month you were born");
		month=scan.nextLine();
		String season;
		
		if(month.equals("January") || month.equals("February") || month.equals("December")) {
			season="Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else {
		season="Unknown";
		}
		System.out.println("You were born in the "+season);
	}

}
