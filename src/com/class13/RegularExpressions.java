package com.class13;

public class RegularExpressions {
//not limited to any programming language =regular expression

	public static void main(String[] args) {

		// [0-9] to print out ONLY the text no numbers
		String str = "14234Hel45555lo4252252";

		System.out.println(str.replaceAll("[0-9]", ""));

		System.out.println("==================");

		System.out.println(str.replaceAll("[a-zA-Z]", "")); // removing text only printing numbers

		System.out.println("==================");

		// remove everything except text and numbers by using ^inside the bracket of
		// string (str2.replaceAll("[^a-zA-Z0-9]", ""));
		String str2 = "Hi@#$%^&How)(*&^55455451524845";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));

		System.out.println("==================");

		// just another way ----> DON'T NEED TO WORRY ABOUT THIS, WE WILL NOT USE IT
		System.out.println(str2.replaceAll("\\w", "")); // prints out special character
		System.out.println(str2.replaceAll("\\W", ""));// prints out text and numbers

	}

}
