package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;


//every testCases must be extended from baseclass
public class TC_LoginTest_001 extends BaseClass {
	 
	

	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		logger.info("URL is opened");
		Thread.sleep(2000);
		lp.setUserName(userName);
		logger.info("username is entered");
		Thread.sleep(2000);
		lp.SetPassword(passWord);
		logger.info("password is entered");
		Thread.sleep(10000);
		lp.clickSubmit();
		logger.info("Submit button is entered");
		
		if(driver.getTitle().equals("Facebook")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test Failed");
		}
		
	}
}
