package com.actitime.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FilLib;
import com.actitime.pom.TasksPage;

public class TasksModule extends BaseClass {
	@Test
	public void testcreateTask() throws IOException 
	{
	//task
	Reporter.log("createTask", true); 
	FilLib fil =new FilLib();
	String expecCreateCustName=fil.getExcelData("createCustomer",1,3,"./data/testscriptdata.xlsx");
	String custDescName=fil.getExcelData("createCustomer",1,4,"./data/testscriptdata.xlsx");	
	TasksPage tp=new TasksPage(driver);
	Reporter.log("createProject", true); 
	tp.getNewTaskBtn().click();
	tp.getSelectCustDDTask().click();
	tp.getCustValue().click();
	tp.getSelectProjectDDTask().click();
	tp.getProjectValue().click();
	tp.getCreateTaskCusBtn().click();
	
	}
}
