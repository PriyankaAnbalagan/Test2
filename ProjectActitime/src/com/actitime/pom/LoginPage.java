package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//to find login page WebElements
public class LoginPage {
//declaration
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver)//constructor
	{
		//initialization of variable
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String un,String pwd)
	{
		//Utilization of variable
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgbtn.click();
	}

}

