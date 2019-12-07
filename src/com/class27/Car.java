package com.class27;

public class Car {

	String make, model;
	int year;

	Car() {
		System.out.println("I am non argument constructor");
	}

	public void display() {
		System.out.println("We build " + year + " " + make + " " + model);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.display();
		
// int num; CE: local variable must be initialized syso(num);
		System.out.println("-----Object of child class------");
		Tesla tes=new Tesla();
		
	}
}
class Tesla extends Car{
	
	boolean autoPilot;
	
	Tesla(){
		super(); //compiler adds it by default... super calls out parent class by default as a reference 
		System.out.println("Non argument constructor of the child class");
	}
	
}