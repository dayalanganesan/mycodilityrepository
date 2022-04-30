package com.heroapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroapp.base.BaseTest;

public class RegisterPage extends BaseTest{

	@FindBy(id="rego")
	WebElement registerBtn;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(name="uname")
	WebElement usernameTxt;

	@FindBy(name="psw")
	WebElement passwordTxt;
	
	@FindBy(name="psw-repeat")
	WebElement passRepeatTxt;
	
	@FindBy(id="signupbtn")
	WebElement signUpBtn;
	
	@FindBy(id="worrior_username")
	WebElement warriorUsernameTxt;
	
	@FindBy(id="worrior_pwd")
	WebElement warriorPasswordTxt;
	
	@FindBy(id="warrior")
	WebElement loginWarriorBtn;
	
	@FindBy(id="start")
	WebElement startJourneyBtn;
	
	@FindBy(xpath="//p[text()='COVID-19 THE GAME']")
	WebElement homePageTxt;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void registerUser() {
		registerBtn.click();
		usernameTxt.sendKeys("water");
		passwordTxt.sendKeys("mypassword");
		passRepeatTxt.sendKeys("mypassword");
		signUpBtn.click();
	}
	
	public void loginUser() {
		warriorUsernameTxt.clear();
		warriorUsernameTxt.sendKeys("water");
		warriorPasswordTxt.sendKeys("mypassword");
		loginWarriorBtn.click();
	}
	
	public void startJourney() {
		startJourneyBtn.click();
	}
	
	public String getHomePageText() {
		return homePageTxt.getText();
	}
	
	
}
