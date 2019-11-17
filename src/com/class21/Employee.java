package com.class21;

public class Employee {
	
	static String CEO;
//	static String CEO="Sumair"; another way to do this
	public String salary;
	public int eID;
	

	public void printInfo() {
		System.out.println(CEO+" has a salary of "+salary+" and the employer ID is "+eID);
		}
	
	
	
	
	public static void main(String[]args) {
		Employee.CEO="Sumair";
		Employee emp1=new Employee();
		emp1.salary="250k";
		emp1.eID=1233456;
		
		emp1.printInfo();
		
		Employee emp2=new Employee();
		emp2.salary="410k";
		emp2.eID=879495;
		
		emp2.printInfo();
		
		
	}
	
	
	
	
	
	
	
}
