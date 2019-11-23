package com.class24;

public class Country {
	public String capital, name;
	public int population;
	
	Country(){
		System.out.println("I am a non argument Constructor");
	}
	
	Country (String name, String capital, int population){
	
	this.name=name;
	this.capital =capital;
	this.population= population;
}
	
	Country (String name, String capital){
		this.name=name;
		this.capital =capital;
		
	}
	
	Country(int population){
		this.population=population;
		System.out.println(name+" "+capital+" "+population);
	}
	
	public void displayInfo() {
		System.out.println(name+" "+capital+" "+population);
	}
	public static void main(String[] args) {
//		Country coun1 = new Country();
//		coun1.name="USA";
//		coun1.capital="Washington DC";
//		
//		
//		Country coun2 = new Country();
//		coun2.name="Kazakhstan";
//		coun2.capital="Astana";
		
		
		Country coun1=new Country("USA","Washington DC", 350);
		Country coun2=new Country("Kazakhstan","Astana", 18);
		Country coun3=new Country();
		Country coun4= new Country(15);
	
		coun1.displayInfo();
		coun2.displayInfo();
		coun3.displayInfo();
		
	
	}
}