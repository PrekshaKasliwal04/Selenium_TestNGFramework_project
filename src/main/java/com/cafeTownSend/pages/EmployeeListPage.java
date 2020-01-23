package com.cafeTownSend.pages;


import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.basesource.action.CommonMethod;
import com.basesource.utils.ObjectReader;

public class EmployeeListPage extends CommonMethod {
	private ObjectReader EmployeeListPagePropertiesReader = new ObjectReader();
	private Properties EmployeeListPageProperties;
	private EmployeeListPage instance;

	public EmployeeListPage getInstance() throws IOException {
		if (instance == null) {
			synchronized (EmployeeListPage.class) {
				if (instance == null) {
					instance = new EmployeeListPage(DRIVER);
				}
			}
		}
		return instance;
	}

	public EmployeeListPage(WebDriver driver) throws IOException {
		EmployeeListPageProperties = EmployeeListPagePropertiesReader.getObjectRepository("EmployeeListPage");
	}

	public final boolean waitForElementsOfEmployeeListPage(String key) throws Exception {
		return verifyElementIsVisible(EmployeeListPageProperties.getProperty(key));
	}

	public final boolean verifyElementIsEnableOfEmployeeListPage(String key) throws Exception {
		return verifyElementIsEnable(EmployeeListPageProperties.getProperty(key));
	}

	public final String getTextOfEmployeeListPage(String key) throws Exception {
		return getTextBy(EmployeeListPageProperties.getProperty(key));
	}

	public final void clickOnElementsOfEmployeeListPage(String key) throws Exception {
		click(EmployeeListPageProperties.getProperty(key));
	}
	
	public final boolean waitUntilElementsOfEmployeeListPage(String key) throws Exception {
		return waitUntillElementIsPresent(EmployeeListPageProperties.getProperty(key));
	}

}
