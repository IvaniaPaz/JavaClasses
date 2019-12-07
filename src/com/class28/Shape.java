package com.class28;

public class Shape {
	
	double radius;
	
	Shape(double radius){
		this.radius=radius;
	}

}
class Circle extends Shape{
	Circle(double radius){
		super(radius);
	}
	public void getArea() {
		double area=3.14*(radius*radius);
		System.out.println("The area of a circle is "+area);
	}
}
