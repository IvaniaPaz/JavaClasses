package com.class31_1;

public interface Shape {
	void calculateArea();

	void calculatePerimeter();
}

class Circle implements Shape {

	int radius;

	Circle(int radius) {
		this.radius=radius;
		System.out.println(radius);
	}

	@Override
	public void calculateArea() {

		double area = 3.14 * (radius * radius);
		System.out.println("The area of a circle is " + area);

	}

	@Override
	public void calculatePerimeter() {

		double perimeter = (2 * 3.14 * radius);

		System.out.println("The perimeter of a circle is " + perimeter);

	}

}

class Square implements Shape {
	int a;
	int p;

	Square(int perimeter, int a) {
		this.a=a;
		p=perimeter;
		System.out.println(perimeter);
	}

	@Override
	public void calculateArea() {

		int area = (a * a);
		System.out.println("The area of a square is " + area);

	}

	@Override
	public void calculatePerimeter() {

		int perimeter = (4 * p);
		System.out.println("The perimeter of square is " + perimeter);

	}

}