package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.base.TestBase;
import com.CRM.qa.config.HomePage;
import com.CRM.qa.config.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup() 
	{
		
		Initialization();
		loginPage = new LoginPage();
			
}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validatingLoginPageTitle();
		Assert.assertEquals(title, "Free CRM in the cloud software boosts sales");
	}
	
	
	@Test(priority=2)
	public void crmLogoImageTest() {
	boolean flag=loginPage.validaCRMImage();
	Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

