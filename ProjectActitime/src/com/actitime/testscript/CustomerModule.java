package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FilLib;
import com.actitime.pom.TasksPage;
//Example for Method Driven Testing
@Listeners(com.actitime.generic.ListenerImplementation.class )
public class CustomerModule extends BaseClass {
	
	
	@Test
	public void testcreateCustomer() throws IOException, InterruptedException
	{
		Reporter.log("createCustomer", true); 
		FilLib fil =new FilLib();
		String expecCreateCustName=fil.getExcelData("createCustomer",1,3,"./data/testscriptdata.xlsx");
		String custDescName=fil.getExcelData("createCustomer",1,4,"./data/testscriptdata.xlsx");	
		TasksPage tp=new TasksPage(driver);
		 tp.getAddNewBtn().click();
		 Thread.sleep(2000);
		 tp.getNewCustBtn().click();
		 Thread.sleep(2000);
	     tp.getCustNameBtn().sendKeys(expecCreateCustName);
		 Thread.sleep(2000);
		 tp.getCustDescBtn().sendKeys(custDescName);
		 Thread.sleep(2000);
		 tp.getSelectCustDD().click();
		 Thread.sleep(2000);
		 tp.getBigBagBtn().click();
		 Thread.sleep(2000);
		 tp.getCreateCustBtn().click();		
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.textToBePresentInElement(tp.getActualTitle(), expecCreateCustName));
		 String actualTitle = tp.getActualTitle().getText();	
		 Assert.assertEquals(actualTitle,expecCreateCustName);
			System.out.println("Pass and verified");
	}
			
			
	}

