package com.classHW;

public class CarObjects {

	String model;
	double price;
	double quantity;

	public CarObjects(String model, double price, double quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}

	public void carStockValue() {

		double stockValue = this.price * this.quantity;

		System.out.println(model + " Stock Value " + stockValue);
	}

}
