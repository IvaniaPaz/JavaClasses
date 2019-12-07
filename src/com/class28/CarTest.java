package com.class28;

public class CarTest {

	public static void main(String[] args) {
		
		Tesla tes= new Tesla();
		Tesla tes1=new Tesla("Tesla", "S4",true);
		tes1.displayInfo();
		System.out.println("----Creating another object----");
		Tesla tes2=new Tesla("Tesla","Cybertruck",false);
		tes2.displayInfo();
		
		
	}
public void helloName(String name) {
	System.out.println("Hello "+name);
}
}
