package com.class36;

public class Car {
	String make, model;
	String color;
	int year;
	String size;

	Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void display() {
		System.out.println(make + " " + model);
	}

}
