package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//UI=user interface ---> what we see and they see
		
		Scanner scanner=new Scanner (System.in);
		
		System.out.print("Enter your class day: ");
		String day=scanner.nextLine();
		
		if(day.toLowerCase().equals("Saturday")) {
			System.out.println("Saturday is your Java class");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.trim().equals("Thursday")) {
			System.out.println("Thursday is your Manual testing class");
		}else {
			System.err.println("Invalid entry!!!! Please enter a valid class day");
		}
		scanner.close();
 }

}
