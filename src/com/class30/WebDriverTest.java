package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver obj = new ChromeDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj.takesPictures();

		System.out.println("==================");

		WebDriver obj1 = new FirefoxDriver();
		obj1.openBrowser();
		obj1.closeBrowser();
		obj1.maximizeWindow();
		obj1.findElement();
		obj1.takesPictures();

	}

}
