package com.class31_1;

public abstract class Marks {

	abstract double getPercentage();
	
}
class A extends Marks{
	double english;
	double math;
	double science;
	
	A(double english, double math,double science){
		this.english=english;
		this.math=math;
		this.science=science;
	}
	@Override
	double getPercentage() {
	 double average= (english+math+science)/3;
	 return average;
		
	}
	
}
class B extends Marks{
	double english;
	double math;
	double science;
	double history;
	
	B(double english, double math, double science, double history){
	this.english=english;
	this.math=math;
	this.science=science;
	this.history=history;
	}
	
	@Override
	double getPercentage() {
		double average= (english+math+science+history)/4;
		 return average;
		
	}
	
}