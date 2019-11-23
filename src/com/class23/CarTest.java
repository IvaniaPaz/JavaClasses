package com.class23;

public class CarTest {

	public static void main(String[] args) {
		Car.make = "Toyota";
		Car car1 = new Car();
		car1.model = "Camry";
		car1.color = "Pink";
		car1.speed = 200;
		car1.doors = 4;
		car1.getDetails();
//		car1.make NOT PREFERRED

		BetterCar betterCar1 = new BetterCar("Toyota", "White", 180, 5);
		betterCar1.getDetails();

	}

}
