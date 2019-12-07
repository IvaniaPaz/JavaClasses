package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
		BMW bmw=new BMW("18795487952","Sedan","BMW","S5");
		BMW.displayTotal();
		Vehicle.displayTotal();
		//comes from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		//comes from car class
		bmw.breaking();
		//comes from bmw class
		bmw.display();
		
		Car car=new BMW("18795487952","Sedan","BMW","S5");
		//comes from vehicle class
				car.drive();
				car.stop();
				car.speed();
				car.start();
				//comes from car class
				car.breaking();
				//comes from bmw class
		//		car.display(); won't be available to the parent class
		
		Vehicle v=new BMW("18795487952","Sedan","BMW","S5");
		//comes from vehicle class
				v.drive();
				v.stop();
				v.speed();
				v.start();
				//comes from car class
		//		v.breaking();
				//comes from bmw class
		//		v.display();
				System.out.println("----------------");
				
				Vehicle.displayTotal();
	}

}
