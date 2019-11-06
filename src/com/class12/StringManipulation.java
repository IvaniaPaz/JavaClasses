package com.class12;

public class StringManipulation {

	public static void main(String[] args) {
		
		// 1st way, String Literal
		String name="Jhon";
		System.out.println(name);
	//	System.out.println(name.length()); // number of length, it is stored in int 
		
		System.out.println("The length of name is = "+name.length());
		
		
		//2nd way,Creating String with new key word
		String name1=new String("John1");
		System.out.println(name1);
		
		System.out.println("============================");
		
		/*This method returns the length of the String
		 * the length is equal to the number
		 * of 16-bit Unicode characters in the String
		 * 
		 */
		int name1Len=name1.length();
		System.out.println("The length of name1 is = "+name1Len);
	
		System.out.println("============================");
		
		/*This method converts ALL of the
		 * characters in this String to lowercase 
		 */
		
		String Str1="Hello World";
		System.out.println("Before:"+Str1);
		
		Str1 = Str1.toLowerCase();
		System.out.println("After:"+Str1);
		
		System.out.println("============================");
		
		/*.equals()
		 *  This method will count everything such as capitalization and content
		 */
		String Str2="HElLo WoRlD";
		
		boolean isEqual=Str1.equals(Str2);
		System.out.println(isEqual);
		
		
		/*.equalsIgnoreCase()
		 * This method does not care for capitalization and compare the content only
		 */
		 
		System.out.println(Str1.equalsIgnoreCase(Str2));
		
		System.out.println("============================");
		
		/*toUpperCase();
		 * This method converts all of the characters in
		 * this String to upper case
		 */
		
		String str3="Mohammad";
		System.out.println("Before:"+str3);
		str3=str3.toUpperCase();
		System.out.println("After:"+str3);	
		
		
		System.out.println("============================");
		
		
		
		
		
	}

}
