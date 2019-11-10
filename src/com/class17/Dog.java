package com.class17;

public class Dog {
	
	String breed, name, color, size, tricks;
	
	void PlayTrick() {
		System.out.println(name+" is a "+breed+" and can do this trick "+tricks);
	}
	void Eat() {
		System.out.println(name+" the "+breed+" can eat a lot");
	}
///////////////////////////////////////////////////////////////////////
	
	public static void main(String[]args) {
	Dog pet=new Dog();
	pet.name="Lucky";
	pet.breed="Labrador";
	pet.color="chocolate brown";
	pet.size="medium";
	pet.tricks="play dead";

	System.out.println("This is my dog "+pet.name+" "+pet.breed+ " he is a "+pet.size+" dog");
	pet.Eat();
	pet.PlayTrick();

	Dog pet1=new Dog();
	pet1.name="pablo";
	pet1.breed="bulldog";
	pet1.color="white";
	pet1.size="big";
	pet1.tricks="roll over";
	
	pet1.Eat();
	pet1.PlayTrick();
	
	Dog pet2=new Dog();
	pet2.name="scooby";
	pet2.breed="husky";
	pet2.color="gray";
	pet2.size="small";
	pet2.tricks="stop drop and roll";
	
	pet2.Eat();
	pet2.PlayTrick();
	
	}
}
