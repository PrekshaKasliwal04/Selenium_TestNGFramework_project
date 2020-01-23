package com.cafeTownSend.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.basesource.action.CommonMethod;
import com.basesource.utils.ObjectReader;

public class EmployeeCreatePage extends CommonMethod {
	private ObjectReader employeeCreatePagePropertiesReader = new ObjectReader();
	private Properties employeeCreatePageProperties;

	private EmployeeCreatePage instance;

	public EmployeeCreatePage getInstance() throws IOException {
		if (instance == null) {
			synchronized (EmployeeCreatePage.class) {
				if (instance == null) {
					instance = new EmployeeCreatePage(DRIVER);
				}
			}
		}
		return instance;
	}

	public EmployeeCreatePage(WebDriver driver) throws IOException {
		employeeCreatePageProperties = employeeCreatePagePropertiesReader.getObjectRepository("EmployeeCreatePage");
	}
	
	public final void clickOnElementsOfEmployeeCreatePage(String key) throws Exception {
		click(employeeCreatePageProperties.getProperty(key));
	}

	public final void enterTextForEmployeeCreatePage(String key, String Text) throws Exception {
		enterText(employeeCreatePageProperties.getProperty(key), Text);
	}
   
	public final boolean waitUntilElementsOfEmployeeCreatePage(String key) throws Exception {
		return waitUntillElementIsPresent(employeeCreatePageProperties.getProperty(key));
	}

	public final boolean waitForElementsOfEmployeeCreatePage(String key) throws Exception {
		return verifyElementIsVisible(employeeCreatePageProperties.getProperty(key));
	}

	public final boolean verifyElementIsEnableOfEmployeeCreatePage(String key) throws Exception {
		return verifyElementIsEnable(employeeCreatePageProperties.getProperty(key));
	}

	public final String getTextOfEmployeeCreatePage(String key) throws Exception {
		return getTextBy(employeeCreatePageProperties.getProperty(key));
	}

}
