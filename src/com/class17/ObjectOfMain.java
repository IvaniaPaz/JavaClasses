package com.class17;

public class ObjectOfMain {

	public static void main(String[] args) {
		
		Main car=new Main();
	    car.color="Black";
	    car.modelYear=2019;
	    car.name="BMW";
	    
	    Main car1=new Main();
	    car1.color="White";
	    car1.modelYear=2018;
	    car1.name="Toyota";
	   
	   System.out.println("Car color is "+car.color+" and model year is "+car.modelYear+ " and car name is "+car.name);
	   System.out.println("Car color is "+car1.color+" and model year is "+car1.modelYear+ " and car name is "+car1.name);
	    

	}

}
