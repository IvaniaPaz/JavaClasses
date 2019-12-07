package com.class28;

public class Car {

	String make, model;

	Car() {
		System.out.println("I am a non argument constructor");
	}

	Car(String make, String model) {
		this.make = make;// these parameters turn to local variables in constructors, when using this.
							// (keyword)
		this.model = model;
	}

}

class Tesla extends Car {
	boolean autoPilot; // instance variable

	Tesla() {
		super();// always has to be the first line, just like keyword
		// compiler will add by default to make a call to super class constructor to initialize and object
		System.out.println("I am a child non argument constructor");
	}

	Tesla(String make, String model, boolean autoPilot) {
		super(make, model); // constructor call
		this.autoPilot = autoPilot;
	}

	public void displayInfo() {
		System.out.println("Car " + make + " " + model + " has an autopilot " + autoPilot);
	}
}