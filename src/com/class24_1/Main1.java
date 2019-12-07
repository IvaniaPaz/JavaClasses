package com.class24_1;

public class Main1 {

	public static void main(String[] args) {
		StoreProduct str = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
		str.displayProducts();

		StoreProduct str1 = new StoreProduct("Paper Towels", 2.0, "misc", false, 24);
		str1.displayProducts();

		StoreProduct str2 = new StoreProduct("Paper Towels", 2.0, "null", false, 0);
		str2.displayProducts();

	}

}
