package com.classHW;

public class ShoppingStore {
	public String item;
	public double price;
	public int quantity;

	ShoppingStore(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public void itemTotalPrice() {

		double itemTotalPrice = this.price * this.quantity;

		System.out.println(item + " Total Value " + itemTotalPrice);
	}


}
