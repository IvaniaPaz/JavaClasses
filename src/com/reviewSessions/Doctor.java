package com.reviewSessions;

public class Doctor {
	
	public String name;
	public String specialty;
	public int licenseID;
	
	public Doctor (String a, String b, int c) {
		name= a;
		specialty=b;
		licenseID =c;
	}
	
	public void checkUp(String name) {
		System.out.println("Doctor "+name+" has ordered blood test for "+name);
	}


	public void treatPatient() {
		System.out.println("Gives patient prescription");
	}
	public void displayInfo() {
		System.out.println("Doctor "+this.name+" with license ID: "+licenseID+" is a ");
	}





}
