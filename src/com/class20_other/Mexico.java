package com.class20_other;

//import com.class20.MySonMath;
//import com.class20.USA;
import com.class20.*; // this imports all thing inside that package

public class Mexico {
	public static void main(String[] args) {
//when USA public		
//		USA us2=new USA ();
//		System.out.println("Access from ");
//		
//		System.out.println(us2.mainState);
//		System.out.println(us2.capitalCity);
//		System.out.println(us2.school);
		
//when USA is default, I cannot access USA class bc they're in different packages
//		USA us3=new USA();
//		System.out.println(us3.mainState);
		
		MySonMath son=new MySonMath();
		son.add1();
	
		Myself me=new Myself();
	
	}
}
