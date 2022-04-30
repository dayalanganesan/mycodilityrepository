package com.heroapp.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heroapp.base.BaseTest;
import com.heroapp.pages.RegisterPage;

public class RegisterPageTest extends BaseTest{
	
	RegisterPage registerPage;
	
	public RegisterPageTest(){
		super();	
	}
	
	@BeforeMethod
	public void setup() {
		initialisation();
		registerPage=new RegisterPage();
	}
	
	@Test(priority=1, enabled=true)
	public void registerUserTest() throws InterruptedException{
		registerPage.registerUser();
		
		Thread.sleep(5000);
		registerPage.loginUser();
		Thread.sleep(5000);
		registerPage.startJourney();
		
		Assert.assertEquals("COVID-19 THE GAME", registerPage.getHomePageText());
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
