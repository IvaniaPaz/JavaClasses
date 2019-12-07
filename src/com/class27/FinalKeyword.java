package com.class27;
// public final class className--> prevents any inheritance
public final class FinalKeyword {
	
	public static final String str="Hello";
	
	public final void hello() {
		System.out.println("I am a final method in Parent class");
	}
	public final void hello(String str) {
	System.out.println("I am a final method in "+str+" class");
	}
	
	public static void main(String[] args) {
	
		String str="I am awesome";
		str="I am cool";
		System.out.println(str); //value of variable changed
		
		final String finalString="Java is easy";
		//finalString="Java is hard"; compile error -- cannot modify final
		
		final int age=120;

		FinalKeyword kw=new FinalKeyword();
		kw.hello("Parent");
		
		
	}
}
// can we overload a final method

//class FinalKeywordChild extends FinalKeyword{
	/*final methods cannot be overridden, we will get compile error
	 * public final void hello(){Syso}
	 */
	
	
//}