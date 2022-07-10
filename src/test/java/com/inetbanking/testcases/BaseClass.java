package com.inetbanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String	username="mngr423267";
	public String    password="gypuqAb";
	public static WebDriver driver;
	
	@BeforeClass
	public void Setup()
	{
		
		System.setProperty("webdrver.chrome.driver",System.getProperty("üser.dir")+"//Driver//chromedriver.exe");
		
		driver =new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown()
	{
		
		driver.quit();
	}
	
}


