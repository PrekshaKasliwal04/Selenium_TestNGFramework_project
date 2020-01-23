package com.cafeTownSend.pages;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.basesource.action.CommonMethod;
import com.basesource.utils.ObjectReader;

public class EmployeeDetailsPage extends CommonMethod {
	private ObjectReader EmployeeDetailsPagePropertiesReader = new ObjectReader();
	private Properties EmployeeDetailsPageProperties;

	private EmployeeDetailsPage instance;

	public EmployeeDetailsPage getInstance() throws IOException {
		if (instance == null) {
			synchronized (EmployeeDetailsPage.class) {
				if (instance == null) {
					instance = new EmployeeDetailsPage(DRIVER);

				}
			}
		}
		return instance;
	}

	public EmployeeDetailsPage(WebDriver driver) throws IOException {
		EmployeeDetailsPageProperties = EmployeeDetailsPagePropertiesReader.getObjectRepository("EmployeeDetailsPage");
	}

	public final void clickOnElementsOfEmployeeDetailsPage(String key) throws Exception {
		click(EmployeeDetailsPageProperties.getProperty(key));
	}

	public final void enterTextForEmployeeDetailsPage(String key, String Text) throws Exception {
		enterText(EmployeeDetailsPageProperties.getProperty(key), Text);
	}

	public final WebElement getElementOfEmployeeDetailsPage(String key) throws Exception {
		return getElement(EmployeeDetailsPageProperties.getProperty(key));
	}

	public final boolean waitUntilElementsOfEmployeeDetailsPage(String key) throws Exception {
		return waitUntillElementIsPresent(EmployeeDetailsPageProperties.getProperty(key));
	}

	public final boolean waitForElementsOfEmployeeDetailsPage(String key) throws Exception {
		return verifyElementIsVisible(EmployeeDetailsPageProperties.getProperty(key));
	}

	public final String getTextOfEmployeeDetailsPage(String key) throws Exception {
		return getTextBy(EmployeeDetailsPageProperties.getProperty(key));
	}

}
