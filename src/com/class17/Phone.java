package com.class17;

public class Phone {

	String name, brand;
	String features, color,type;
	
	
	
	void call() {
		System.out.println("I can call on my "+name+" "+brand);
	}
	void Apps() {
		System.out.println("I can use/do this "+features);	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[]args) {
		
	Phone cellphone= new Phone ();	
	cellphone.name="iPhone";	
	cellphone.brand="Apple";
	cellphone.color="Rose gold";	
	cellphone.type="10 plus";
	cellphone.features="FaceTime";
	
	System.out.println("I have "+cellphone.name+" "+cellphone.brand);	
	cellphone.call();
	cellphone.Apps();
			
	Phone cellphone1= new Phone();	
	cellphone1.name="Android";	
	cellphone1.brand="Samsung";	
	cellphone1.color="Black";
	cellphone1.type="S3";
	cellphone1.features="3 button navigation";
	
	cellphone1.Apps();
	cellphone1.call();
	
	Phone cellphone2=new Phone();
	cellphone2.name="Pureview";	
	cellphone2.brand="Nokia";	
	cellphone2.color="White";
	cellphone2.type="9";
	cellphone2.features="5 camera lenses";	
	
	cellphone2.Apps();
	cellphone2.call();
	
	}
	
}
