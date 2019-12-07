package com.class28;

public class Room extends Building{
	
	int roomNumber;
	
	Room(String address, int floor, int roomNumber){
		super(address, floor); //default it will add this 
		this.roomNumber=roomNumber;
	}
	
	public void print() {
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	public static void main(String[] args) {
		Room room=new Room("7909 Vernon Dr.",7,101);
		room.print();
//		System.out.println(room.floor);//by calling Building () <-non argument constructor  
//		//super() it'll add default values to variables
	}
	
}
