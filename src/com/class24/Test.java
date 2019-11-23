package com.class24;

public class Test {

	public static void main(String[] args) {
		Child1 child1=new Child1();
		System.out.println(Child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();

System.out.println("--------------");
		
		Parent p=new Parent();
		System.out.println(p.hairColor);
		System.out.println(p.eyeColor);
		System.out.println(Parent.race);
		p.sing();
//		p.code();
	
System.out.println("--------------");
		Child2 child2=new Child2();
		System.out.println(Child2.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.draw();
		
	}

}
