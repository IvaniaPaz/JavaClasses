package com.class31;

public class CarTest {

	public static void main(String[] args) {
		Sedan s=new Sedan(25000,"black",15);
		double salePrice=s.calculateSalePrice();
		System.out.println("The sale price is "+salePrice);
		
		Sedan s2=new Sedan(25000, "black",25);
		double salePrice2=s2.calculateSalePrice();
		System.out.println("The sale price of sedan 2 is "+salePrice2);
	
		System.out.println("===========");
		
		Truck t=new Truck(40000, "White",1000);
		double truckSaleprice=t.calculateSalePrice();
		System.out.println("the truck sale price is "+truckSaleprice);
		
		Truck t2=new Truck(40000, "Red",2500);
		double truckSaleprice2=t2.calculateSalePrice();
		System.out.println("the #2 truck sale price is "+truckSaleprice2);
	}

}
