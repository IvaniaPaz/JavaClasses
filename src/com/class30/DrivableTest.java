package com.class30;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Toyota();
		obj.drive();
	//	obj.DRIVE_FAST=false; compile error, final value cannot be reassigned  
		
		Toyota t=new Toyota();
		t.drive();
		t.stop();
		
		
	}
}
