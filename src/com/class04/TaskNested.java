package com.class04;

public class TaskNested {

	public static void main(String[] args) {

		boolean diploma = true;
		float gpa = 3.5f;

		if (diploma) {
			System.out.println("Congratulations!!");
			if (gpa >= 2.3) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You need to get a degree");
			

		}
System.out.println("------------------");
	
		double rate = 2.5;
		double price = 15000;

		if (rate > 4.5) {
			System.out.println("user will not buy house");
		} else {
			System.out.println("user will consider buying");
			if (price > 200000) {
				System.out.println("user will take a loan");
			} else {
				System.out.println("User will pay cash");
			}	
		}

	}
}
