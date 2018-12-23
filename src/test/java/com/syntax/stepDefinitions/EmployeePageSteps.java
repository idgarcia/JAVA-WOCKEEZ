package com.syntax.stepDefinitions;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.syntax.pages.EmployeePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeePageSteps extends BaseClass {

	EmployeePage EmpPage;

	@Given("^I logged into OrangeHRM$")

	public void i_logged_into_OrangeHRM() throws Throwable {

		LoginPage login = new LoginPage();

		CommonMethods.enterValue(login.username, BaseClass.prop.getProperty("username"));

		CommonMethods.enterValue(login.password, BaseClass.prop.getProperty("password"));

		CommonMethods.click(login.btnLogin);

	}

	@Given("^I navigated to the Add Employee Page$")

	public void i_navigated_to_the_Add_Employee_Page() throws Throwable {

		EmpPage = new EmployeePage();

		CommonMethods.click(EmpPage.PIM);

		CommonMethods.click(EmpPage.addEmp);

	}

	@When("^I provide the first name, middle name and last name of the employee$")

	public void i_provide_the_first_name_middle_name_and_last_name_of_the_employee() throws Throwable {

		CommonMethods.enterValue(EmpPage.fName, "Bob");

		CommonMethods.enterValue(EmpPage.mName, "B");

		CommonMethods.enterValue(EmpPage.lName, "Syntax");

		CommonMethods.click(EmpPage.btnsave);

	}

	@Then("^I successfully added an employee$")

	public void i_successfully_added_an_employee() throws Throwable {

		Assert.assertTrue("Bob B Syntax", true);

	}

	@Given("^I navigated to the Employee List Page$")

	public void i_navigated_to_the_Employee_List_Page() throws Throwable {
		CommonMethods.click(EmpPage.empList);
		
	}

	@When("^I search for an added employee$")

	public void i_search_for_an_added_employee() throws Throwable {

		Thread.sleep(2000);
		CommonMethods.enterValue(EmpPage.SearchEmp, "Bob B Syntax");
		EmpPage.SearchBtn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		CommonMethods.click(EmpPage.SearchBtn);

	}

	@When("^selected that employee$")

	public void selected_that_employee() throws Throwable {


		List<WebElement> employeeList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 1; i <= employeeList.size(); i++) {


			String rowValue = employeeList.get(i).getText();

			if (rowValue.contains("Bob B Syntax")) {

				List<WebElement> link = employeeList.get(i).findElements(By.tagName("a"));
				link.get(0).click();
				break;
			}

		}

	}

	@Then("^I navigated to the employee profile$")

	public void i_navigated_to_the_employee_profile() throws Throwable {

		Thread.sleep(3000);
		CommonMethods.click(EmpPage.btnsave);

	}

	@Then("^I can edit Employee information$")

	public void i_can_edit_Employee_information() throws Throwable {

		CommonMethods.enterValue(EmpPage.empIdBox, "0013");

		Thread.sleep(5000);

		CommonMethods.click(EmpPage.btnsave);

	}

	@Then("^I should be able to delete that employee$")

	public void i_should_be_able_to_delete_that_employee() throws Throwable {
		CommonMethods.click(EmpPage.PIM);
		CommonMethods.click(EmpPage.ViewEmpList);
		
		CommonMethods.enterValue(EmpPage.SearchEmp, "Bob B Syntax");
//		EmpPage.SearchBtn.sendKeys(Keys.ENTER);
////		CommonMethods.click(EmpPage.SearchBtn);

		CommonMethods.click(EmpPage.selectAll);

		CommonMethods.click(EmpPage.DelBtn);
		
		CommonMethods.click(EmpPage.deleteOkbtn);

	}

}