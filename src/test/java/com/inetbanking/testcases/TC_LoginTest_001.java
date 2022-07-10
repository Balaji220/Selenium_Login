package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass

{
	@Test
	public void loginTest()
	
	{
		driver.get(baseURL);
		
    LoginPage lp = new LoginPage(driver);
	
	lp.setuserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	
	if (driver.getTitle().equals("Guru Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		
		
	}
	else 
	{
		Assert.assertFalse(false);
	}
	}

}
