package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
						"/Users/nuhhacibektasoglu/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
//		System.setProperty("webdriver.gecko.driver",
//				"/Users/nuhhacibektasoglu/Documents/selenium dependencies/drivers/geckodriver");
//
//		WebDriver driver1 = new FirefoxDriver();
//
//		driver1.get("http://google.com");
		
	}
}
