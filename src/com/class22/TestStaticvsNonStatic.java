package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		/*How to access static method
		 * they can be accessed by ClassName
		 */

		System.out.println(StaticVSNonStatic.school);
		StaticVSNonStatic.getInfo1();
		
		/*How to access non static method
		 * they can be accessed by creating an object of that class
		 */
		StaticVSNonStatic obj= new StaticVSNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();
//		obj.getInfo1(); possible BUT not preferable
		
		
		
		
		
	}

}
