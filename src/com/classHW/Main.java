package com.classHW;

public class Main {
//	Create instance variables as below.
//	model
//	price, 
//	quantity
//	Create a constructor that will initialize instance variables. 
//	Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result. 
//	run the application in Main Class
//	Output:
//	Toyota 2019 Stock Value 2500000.0
//	BMW 2019 Stock Value 652980.0

	public static void main(String[] args) {
		CarObjects toyotaCar = new CarObjects("Toyota 2019", 25000, 100);
		toyotaCar.carStockValue();

		CarObjects bmwCar = new CarObjects("BMW 2019", 65298, 10);
		bmwCar.carStockValue();

	}
}
