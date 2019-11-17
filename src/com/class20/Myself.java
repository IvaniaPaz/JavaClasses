package com.class20;

public class Myself {
public static void main (String[]args) {
	MySonMath son0=new MySonMath();
	son0.name="Enes";
	son0.phone="234-567-8900";
	son0.birthday="05/05/2000";
	
	
	
	
	MySonMath son1=new MySonMath();
	son1.name="Ensar";
	son1.phone="123-456-7890";
//	son1.SSN=""; you cannot access this bc it is private 
	son1.birthday="01/20/2003";
	
	MySonMath daughter2=new MySonMath();
	
	son1.add1(); //this method does not accept parameter
	
	son1.add2(2,3);//this method accepts parameter
	
	int result=son1.add3();//this method does not accept parameter
	System.out.println(result);
	
	int result4=son1.add4(5, 7);
//	son1.add5(); this meth
	
	Myself mySelf=new Myself();
	
	boolean good =mySelf.checkResult(12,result4);
	if(good) {
		System.out.println("Good job "+son1.name);
	}else {
		System.out.println("You are not doing a good job");}
	}

	boolean checkResult(int myResult, int mySonResult) {
		boolean isOkay=false;
		
		if(myResult==mySonResult) {
			isOkay=true;
		}else {
			isOkay=false;
		}return isOkay;
	}
	
}
