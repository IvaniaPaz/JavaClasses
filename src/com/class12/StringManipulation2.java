package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		
		/*.contains();
		 * This method looks for the sequence of characters in the string.
		 * If the sequence of characters are found ,
		 * then it returns true, otherwise returns false
		 */
		
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("w"));
		
	System.out.println("====================");
		
		/*.startsWith(add String value);
		 * This method tests if a String starts with the
		 * specified prefix beginning 
		 * does it start with this letter yes or no? that is all this method  is asking for
		 */
		String str2="It is very hot in the class";
		System.out.println("Does this string start with= "+str2.startsWith("It"));
		System.out.println("Does this string start with= "+str2.startsWith("is",3)); // 3 is the index of each letter, you don't need []
		
	
	System.out.println("====================");
		
		/*.endsWith(add String value);
		 * this method test if this string ends with
		 * the specified suffix
		 */
		
	System.out.println("Does this String start with= "+str2.endsWith("class"));
			
	}
}