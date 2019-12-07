package com.class26;

public class WebBrowserTest {
	public static void main(String[] args) {
	
		ChromeDriver chrome= new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FireFoxDriver firefox= new FireFoxDriver();
		firefox.refresh();
		firefox.open();
	
	System.out.println("-------------------------");	
		
	//creating an object of child class and giving reference to the parent class 
		WebDriver driver= new FireFoxDriver();
		driver.refresh();
		driver.open();
	// no access to child specific class through Parent type
		/*first checks on the parent class to see if you have the method
		 * it'll override in child class if they share the same method. So parent method will not print.
		 * if child class doesn't have a method to execute it will execute the parent class
		 */
		
}
}
