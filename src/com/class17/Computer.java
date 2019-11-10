package com.class17;

public class Computer {

	//define attributes/features
	boolean keyboard;
	String brand, name;
	int screen, memory,size,ram;
	
//define behavior/actions
	void playGames() {
		System.out.println("I can play on my "+name);
	}
	
	void javaCoding() {
		System.out.println("I can do Java coding on my "+name);
	}
	
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
/////////////////////////////////////////////////////////////////////////////////
	
public static void main(String[]args) {	
	Computer comp1=new Computer();
	comp1.brand="Apple";
	comp1.name="MacBook Pro";
	comp1.memory=250;
	
System.out.println("I have "+comp1.brand+" "+comp1.name);	
	comp1.javaCoding();
	comp1.watchMovie();
	
	System.out.println("------Creating second object of a computer type-----");
	Computer computer2=new Computer();
	computer2.brand="Dell";
	computer2.name="420";
	computer2.memory=125;
	
	computer2.javaCoding();
	computer2.watchMovie();
	computer2.playGames();
	
	
	
}
	
	
}