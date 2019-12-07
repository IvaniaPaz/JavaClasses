package com.class28;

public class Building {
	int floor;//0
	String address;//null
	
	Building (String address, int floor){
		this.address=address;
		this.floor=floor;
	}// once you create your own constructor the compiler CANNOT add default non argument constructor. you would need to add one
//	Building (){
//		
//	}
}
