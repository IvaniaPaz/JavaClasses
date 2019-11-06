package com.class12;

public class StringManClassTask {

	public static void main(String[] args) {
		
		/*Create 2 Strings and initialize them with some value
		 * implement the following method on those strings
		 * 
		 */
		/*sen.length();
		 * sen.equals();
		 * sen.contains();
		 * sen.toUpperCase();
		 * sen.toLowerCase();
		 * sen.equalsIgnoreCase(anothersentence);
		 */
		
		String colors="pink";
		String color1="p";
		
		
		
		System.out.println("The length of the color is "+colors.length());
		
		boolean isEqual=colors.equals(color1);
		System.out.println(isEqual);
		
		System.out.println(color1.contains(colors));
		System.out.println(colors.contains("p"));
		
		colors=colors.toUpperCase();
		System.out.println(colors);
		
		colors=colors.toLowerCase();
		System.out.println(colors);
		
		System.out.println(colors.equalsIgnoreCase(color1));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
