package com.reviewSessions;

public class Hospital  {

	public static void main(String[] args) {
		Doctor d1= new Doctor("John","Family doctor",123456);
//		d1.name="John";
//		d1.specialty="Family doctor";
//		d1.licenseID=123456;
	/*do not need to create variable bc in the object we 
	 * had done that
	 */
		
		d1.displayInfo();
		d1.checkUp("Adam");

	}

}
