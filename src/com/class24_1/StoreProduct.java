package com.class24_1;

public class StoreProduct {
	public String label, category;
	public double price;
	public int stock;
	public boolean hasExpiration;

	StoreProduct(String storeLabel, double storePrice, String storeCategory, boolean storeHasExp, int storeStock) {
		label = storeLabel;
		price = storePrice;
		category = storeCategory;
		hasExpiration = storeHasExp;
		stock = storeStock;

	}

	StoreProduct(String storeLabel, int storePrice, int storeStock) {
		label = storeLabel;
		price = storePrice;
		category = "misc";
		hasExpiration = false;
		stock = storeStock;
	}

	StoreProduct(String storeLabel, int storePrice) {
		label = storeLabel;
		price = storePrice;
		category = "null";
		hasExpiration = false;
		stock = 0;
	}

	public void displayProducts() {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}

}
