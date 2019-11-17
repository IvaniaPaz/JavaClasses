package com.class20_other;

import com.class20.MySonMath;

public class Andrei {

	public static void main(String[] args) {
		MySonMath elionSon=new MySonMath();
		
		/*All of these variables are not visible by Andrei
		 * 
		 */
		
		elionSon.name="Ali";
//		elionSon.phone cannot be seen bc it is default only lives within package it was created
//		elionSon.SSN=""; can't access it 
//		elionSon.birthday=""; he cannot access it 
		
		elionSon.add1();
		
// cannot see any of these 3:
//		elionSon.add2(2,3);
//		int result=elionSon.add3();
//		int result4=elionSon.add4(5, 7);

	}

}
