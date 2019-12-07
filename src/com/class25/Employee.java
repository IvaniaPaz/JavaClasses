package com.class25;

public class Employee {
	
	int salary;
	public static String companyName;
	protected int employeeID;
	private String employeeSSN;
	
	void work() {
		System.out.println("I work in "+companyName+" company");
	}

	void getPaid() {
		System.out.println("I get paid "+salary);
	}
}
