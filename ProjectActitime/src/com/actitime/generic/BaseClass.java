package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TasksPage;

public class BaseClass {
public static WebDriver driver;
@BeforeTest
public void openBrowser()
{
	Reporter.log("openBrowser", true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));	
}
@BeforeMethod
public void login() throws IOException
{
	Reporter.log("login", true);
	FilLib fil=new FilLib();
	//passing the key and fetching value
	String url = fil.getPropertyData("url");
	String password = fil.getPropertyData("password");
	String username = fil.getPropertyData("username");
	driver.get(url);//entering the url
	LoginPage lp=new LoginPage(driver);
	lp.setLogin(username, password);//passing the value for login
	HomePage hp=new HomePage(driver);
 hp.taskTab();	
 
}


@AfterMethod
public void logout()
{
	Reporter.log("logout", true);
	HomePage hp=new HomePage(driver);
	hp.setLogout();
}
@AfterTest
public void closeBrowser()
{
	Reporter.log("closeBrowser", true);
	driver.quit();	
}
}
