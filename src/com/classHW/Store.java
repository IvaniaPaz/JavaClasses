package com.classHW;

public class Store {

	public static void main(String[] args) {
		 ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      
	      blancket.itemTotalPrice();
	      mattress.itemTotalPrice();
	      
	      System.out.println("You purchased "+(439.18+99.98)+" Today");

	}

}
