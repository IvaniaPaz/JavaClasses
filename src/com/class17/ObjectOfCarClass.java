package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		/*To create an Object Syntax is 
		 * ClassName variable=new ClassName();
		 * Ex: Scanner scan=new Scanner(System.in)
		 * Ex: string str=new String();
		 */

		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
    // accessing behavior for object		
		car1.drive();
		car1.accelerate();
		car1.start();
		
		
	
	System.out.println("-----------");	
		Car car2=new Car();
		car2.make="BMV";
		car2.model="i8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=300;
		car2.make="toyota";

   // accessing behavior for object
		car2.accelerate();
		car2.drive();
		car2.start();
		
		System.out.println("--------");
		
//Print features of the car "I have black Tesla"	
		
System.out.println("I have "+car1.color+" "+car1.make);
		
// I drive BMV 2019
		
System.out.println("I drive "+car2.make+" "+car2.year);
		
	}

}
