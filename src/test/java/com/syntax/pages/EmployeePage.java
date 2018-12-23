package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class EmployeePage extends BaseClass {

	@FindBy(linkText = "PIM")
	public WebElement PIM;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;

	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement addBtn;

	@FindBy(name = "firstName")
	public WebElement fName;

	@FindBy(name = "middleName")
	public WebElement mName;

	@FindBy(name = "lastName")
	public WebElement lName;

	@FindBy(id = "btnSave")
	public WebElement btnsave;

	@FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
	public WebElement SearchEmp;

	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement SearchBtn;

	@FindBy(xpath = "//a[contains(text(),'Bob B')]")
	public WebElement empBob;

	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']")
	public WebElement empIdBox;

	@FindBy(xpath = "//a[@id='menu_pim_viewEmployeeList']")
	public WebElement ViewEmpList;

	@FindBy(linkText = "Employee List")
	public WebElement empList;

	@FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
	public WebElement selectAll;

	@FindBy(linkText = "Edit")
	public WebElement editbtn;

	@FindBy(xpath = "//input[@id='btnDelete']")
	public WebElement DelBtn;
	
	@FindBy(xpath="//input[@id='dialogDeleteBtn']")
	public WebElement deleteOkbtn;

	public EmployeePage() {
		PageFactory.initElements(driver, this);

	}

}
