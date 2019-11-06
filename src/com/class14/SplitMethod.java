package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
	

	/*.split()
	 * This method splits this string around matches of the given regular expression
	 * //allows us to split a method and returns as a String 
	 */
	String str="Video provides a poweful way to help you prove your point.";
	
	 String[] array=str.split(" ");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("============");
		
		/*How can we find how many sentences are in the following String.
		 *  \\. This is an expression that we can use for this. 
		 *  to find the size of the array you would need to use this statement in order to get the answer. 
		 * 
		 */
		
		String str1="Today is Sunday. It's a sunny day. And we are having Java class";

		
		String[] array2=str1.split("\\."); //you CANNOT add trim to Array ONLY to String. 
		System.out.println("The number of sentences in the given String is: "+array2.length);
		
		for(String string:array2) {
		System.out.println(string.trim()); // you would add the string manipulation here where it prints.
		}
		
		System.out.println("============");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}