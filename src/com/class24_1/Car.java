package com.class24_1;

public class Car {
	

			 public String  make, model;
			 public int numberOfDoors, topSpeed;
			 public double price;
			  
			 Car(String carMake, String carModel,int carDoor, int carSpeed, double carPrice){
			    make=carMake;
			    model=carModel;
			    numberOfDoors=carDoor;
			    topSpeed=carSpeed;
			    price=carPrice;
			  }
			  Car(String carMake, String carModel, int carSpeed, double carPrice){
			    make=carMake;
			    model=carModel;
			    numberOfDoors=4;
			    topSpeed=carSpeed;
			    price=carPrice;
			  }
			  Car(int carDoor,int carSpeed, double carPrice){
			    make="unknown";
			    model="unknown";
			    numberOfDoors=carDoor;
			    topSpeed=carSpeed;
			    price=carPrice;
			  }
			   Car(String carMake, String carModel, int carDoor){
			    make=carMake;
			    model=carModel;
			    numberOfDoors=carDoor;
			    topSpeed=90;
			    price=0;
			  
			   }
			  public void displayMethods() {
		System.out.println(make+" "+model+" "+topSpeed+" "+price);
			  }
}
