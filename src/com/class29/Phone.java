package com.class29;

public abstract class Phone {

	// implemented methods
	public void makeCall() {
		System.out.println("make a call");
	}

	public void sendText() {
		System.out.println("send a text");
	}

	// unimplemented methods- meaning you have a method header but no method body
	public abstract void takePics();

	public abstract void playGames();
}
//concrete class
class iPhone extends Phone {

	public void takePics() {
		System.out.println("iPhone takes pics");

	}

	public void playGames() {
		System.out.println("Play games on iPhone");
	}

abstract class Samsung extends Phone{ //another way 

	
	public void takePics() {
	
		
	}

	
	public void playGames() {
		
		
	}
 } 
}