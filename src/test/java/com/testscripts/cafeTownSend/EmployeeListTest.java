package com.testscripts.cafeTownSend;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.basesource.action.PreDefinedActions;
import com.cafeTownSend.pages.EmployeeCreatePage;
import com.cafeTownSend.pages.EmployeeDetailsPage;
import com.cafeTownSend.pages.EmployeeListPage;

public class EmployeeListTest extends CommonTest {
	private static Logger LOGGER = Logger.getLogger(EmployeeListTest.class);
    public String branchName = null;	
    

	
	@Test(priority = 1, groups = { "REGRESSION"},description = "Verify that User should be able to Create new Employee record")
	public final void verifyCreateEmployeeFunction() throws Exception {
		waitForPageLoaded();
		login("correctId", "correctPassword");		
		EmployeeListPage employeesListPage = new EmployeeListPage(PreDefinedActions.getDriver()).getInstance();	
		EmployeeCreatePage newEmployeePage = new EmployeeCreatePage(PreDefinedActions.getDriver()).getInstance();	
		employeesListPage.waitUntilElementsOfEmployeeListPage("employeeListTitle");
		employeesListPage.clickOnElementsOfEmployeeListPage("create");
		Assert.assertEquals(getCredentials("LoginCredentials", "newEmployeeUrl"), employeesListPage.getUrlOfCurrentPage());
		LOGGER.info("Create Url Check Success");
		String firstNameEnter = generateRandomString();
		String lastNameEnter = generateRandomString();
		String emailEnter = generateAlphaRandomNumber();
		newEmployeePage.enterTextForEmployeeCreatePage("firstName", firstNameEnter);
        newEmployeePage.enterTextForEmployeeCreatePage("lastName", lastNameEnter);
        newEmployeePage.enterTextForEmployeeCreatePage("startDate", "2020-01-22");
        newEmployeePage.enterTextForEmployeeCreatePage("email", emailEnter+"@test.com");
        newEmployeePage.clickOnElementsOfEmployeeCreatePage("add"); 
		employeesListPage.waitUntilElementsOfEmployeeListPage("employeeListTitle");
		sleeper(2000);
		Assert.assertEquals(getCredentials("LoginCredentials", "employeeListUrl"), employeesListPage.getUrlOfCurrentPage());
        logout();	
		LOGGER.info("Create User Test Case result is: Success");
	}

	
	
}
