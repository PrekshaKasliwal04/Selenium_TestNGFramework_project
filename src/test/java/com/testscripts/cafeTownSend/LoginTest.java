package com.testscripts.cafeTownSend;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basesource.action.PreDefinedActions;
import com.cafeTownSend.pages.EmployeeListPage;
import com.cafeTownSend.pages.LoginPage;


public class LoginTest extends CommonTest {
	private static Logger LOGGER = Logger.getLogger(LoginTest.class);
	
	@Test(priority = 1, groups = { "REGRESSION"},description = "Verify user should be able to login with valid credentials")
	public final void verifyUserLoginWithValidCreds() throws Exception {
		waitForPageLoaded();
		login("correctId", "correctPassword");		
		EmployeeListPage employeeListPage = new EmployeeListPage(PreDefinedActions.getDriver()).getInstance();
		employeeListPage.waitUntilElementsOfEmployeeListPage("employeeListTitle");		
		Assert.assertEquals(getCredentials("LoginCredentials", "employeeListUrl"), employeeListPage.getUrlOfCurrentPage());
		LOGGER.info("After login URL check Success");

		Assert.assertTrue(employeeListPage.getTextOfEmployeeListPage("employeeListTitle").equals("Hello "+getCredentials("LoginCredentials", "correctId")), "Employee Username is not displayed");			
		LOGGER.info("Valid User Login Test Case result is: Success");
        logout();
		LOGGER.info("LogOut function Test Check result is: Success");
	}
	
	@Test(priority = 2, groups = { "REGRESSION"},description = "Verify user should not be able to login with Invalid login credentials")
	public final void verifyUserLoginWithInValidCreds() throws Exception {
		LoginPage loginPage = new LoginPage(PreDefinedActions.getDriver()).getInstance();
		waitForPageLoaded();
		login("random", "random");	
		Assert.assertTrue(loginPage.getTextOfLoginPage("authError").equals(getCredentials("LoginCredentials", "authError")), "Entered user details are not In-valid or the error text is changed");	
		LOGGER.info("InValid User Login Test Case result is: Success");		
	}

}
