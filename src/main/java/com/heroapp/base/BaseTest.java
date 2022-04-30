package com.heroapp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BaseTest {

public static WebDriver driver;
public static String MainWindow;
public static SoftAssert softAssert;
	
	public static void initialisation() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/BrowserDriverFile/chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://responsivefight.herokuapp.com/");
		MainWindow = driver.getWindowHandle();
	}
}
