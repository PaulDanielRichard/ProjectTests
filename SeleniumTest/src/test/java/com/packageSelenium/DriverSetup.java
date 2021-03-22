package com.packageSelenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup 
{
	
	WebDriver driver;
	@Test
	public void createDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./WebDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.zigwheels.com");
		driver.manage().window().maximize();
	}
	
}
