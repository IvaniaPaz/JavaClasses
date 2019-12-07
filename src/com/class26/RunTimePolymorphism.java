package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// creating an object of parent class
		Animal animal= new Animal();
		animal.eat();
		animal.sleep();
		
		//creating an object of parent class
		Cat cat = new Cat();
		cat.eat();//from parent
		cat.sleep();//from parent
		cat.meow();//from child
		
		//widening
		double d=90;
		
		//narrowing
		int i=(int)1.99;

		//Non-primitive typecasting	
	//widening - creating object of child class(Sub class) and giving reference to the parent class(Super class)
		Animal obj=new Cat();
		obj.eat();
		obj.sleep(); // from child -> runtime polymorphism
//		obj.meow(); compile error ->method isn't available
		/*Narrowing
		 * Give you an error bc you are trying to put higher class into a small class
		 * Cat obj2=new Animal();--> cannot convert.
		 */
		
		
	}
}
