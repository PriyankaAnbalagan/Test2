package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustBtn;	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custNameBtn;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescBtn;
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustDD;
	@FindBy(xpath="//div[text()='Big Bang Company'  and @class='itemRow cpItemRow ']")//Xpath using Logical 
	private WebElement bigBagBtn;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer'] /div[@class='title']")
	WebElement actualTitle;
	
	//project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectNameBtn;
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")	
	private WebElement selectprjctDD;
	@FindBy(xpath="//div[text()='HDFC-001AP1']")
	private WebElement project2;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescBtn;	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createprjctCusBtn;
	
	//task
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskBtn;
	@FindBy(xpath="(//div[@class='comboboxButton']//descendant::div[text()='- Select Customer -'])[2]")
	private WebElement selectCustDDTask;
	@FindBy(xpath="//div[text()='HDFC-001AP']")
	private WebElement custValue;
	@FindBy(xpath="//div[@class='comboboxButton']//descendant::div[text()='- Select Project -']")
	private WebElement selectProjectDDTask;
	@FindBy(xpath="//div[text()='Banking project']")
	private WebElement projectValue;
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskCusBtn;
	
	
	public  TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
}


	public WebElement getAddNewBtn() {
		return addNewBtn;
	}


	public WebElement getNewCustBtn() {
		return newCustBtn;
	}


	public WebElement getCustNameBtn() {
		return custNameBtn;
	}


	public WebElement getCustDescBtn() {
		return custDescBtn;
	}


	public WebElement getSelectCustDD() {
		return selectCustDD;
	}


	public WebElement getBigBagBtn() {
		return bigBagBtn;
	}


	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}


	public WebElement getActualTitle() {
		return actualTitle;
	}

//project
	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}


	public WebElement getProjectNameBtn() {
		return projectNameBtn;
	}


	public WebElement getSelectprjctDD() {
		return selectprjctDD;
	}


	public WebElement getProject2() {
		return project2;
	}


	public WebElement getProjectDescBtn() {
		return projectDescBtn;
	}


	public WebElement getCreateprjctCusBtn() {
		return createprjctCusBtn;
	}
//task

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}


	public WebElement getSelectCustDDTask() {
		return selectCustDDTask;
	}


	public WebElement getCustValue() {
		return custValue;
	}


	public WebElement getSelectProjectDDTask() {
		return selectProjectDDTask;
	}


	public WebElement getProjectValue() {
		return projectValue;
	}


	public WebElement getCreateTaskCusBtn() {
		return createTaskCusBtn;
	}
	
	
}
