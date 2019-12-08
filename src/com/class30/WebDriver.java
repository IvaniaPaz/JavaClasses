package com.class30;

interface TakesScreenshot { // An interface uses the extends keyword to implement an interface.
	
	//public static final - adds this automatically.. no need to add that part 
	String $FILE_EXTENSION=".png";
	void takesPictures();
	static void takesSelfie() {
	System.out.println("I am defined static method of TakesScreendhot Interface");
	}
	default void takesScreen() {
		System.out.println("I am default defined method of TakesScreenshot interface");
	}
}

interface Application{
	void applicationTest();
}
public interface WebDriver extends TakesScreenshot{
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}


abstract class Browser{
	public abstract void refresh();
}
class ChromeDriver extends Browser implements WebDriver, Application{

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome can find element");
		
	}

	@Override
	public void refresh() {
	System.out.println("Refresh Chrome browser");
		
	}

	@Override
	public void takesPictures() {
    System.out.println("Takes screenshot in Chrome");
		
	}

	@Override
	public void applicationTest() {
	System.out.println("Application test in Chrome");	
		
	}
	
}
class FirefoxDriver extends Browser implements WebDriver, Application{

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox can close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can maximize window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox can find element");
		
	}

	@Override
	public void refresh() {
	System.out.println("Refresh Firefox browser");
		
	}

	@Override
	public void takesPictures() {
    System.out.println("Takes screenshot in Firefox");
		
	}

	@Override
	public void applicationTest() {
	System.out.println("Application test in Chrome");	
		
	}
	
}