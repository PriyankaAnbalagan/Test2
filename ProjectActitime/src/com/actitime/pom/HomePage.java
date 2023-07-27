package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//to find home page WebElements
public class HomePage {
	
	//declaration
		@FindBy(id="logoutLink")
		private WebElement logout;
		@FindBy(xpath="//div[text()='Tasks']")
		private WebElement tasksTab;
		
		
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
}
	public void setLogout()
	{
		logout.click();
	}
	public void taskTab()
	{
		tasksTab.click();
	}
}
