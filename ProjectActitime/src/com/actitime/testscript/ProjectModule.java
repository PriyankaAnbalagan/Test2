package com.actitime.testscript;

import java.io.IOException;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FilLib;
import com.actitime.pom.TasksPage;
@Listeners(com.actitime.generic.ListenerImplementation.class )
public class ProjectModule extends BaseClass{
	@Test
	public void testcreateProject() throws IOException, InterruptedException 
	{
	//project

		Reporter.log("createProject", true); 
		TasksPage tp=new TasksPage(driver); 
		 tp.getAddNewBtn().click();
		 Thread.sleep(2000);
	tp.getNewProjectBtn().click();
	Thread.sleep(2000);
	tp.getProjectNameBtn().sendKeys("Banking Project");
	Thread.sleep(2000);
	tp.getSelectprjctDD().click();
	Thread.sleep(2000);
	tp.getProject2().click();
	Thread.sleep(2000);
	tp.getProjectDescBtn().sendKeys("All Banks");
	Thread.sleep(2000);
	tp.getCreateprjctCusBtn().click();
	}
}
