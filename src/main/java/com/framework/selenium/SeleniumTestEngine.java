/**
 * 
 */
package com.framework.selenium;

import org.openqa.selenium.WebDriver;

import com.framework.browsers.BrowserTypes;
import com.framework.core.TestApplication;
import com.framework.core.TestEngine;

/**
 * @author surendrane
 *
 */
public class SeleniumTestEngine extends TestEngine{
	
	WebDriver driver;
	
	@Override
	public TestApplication start(String application) {
		// TODO Auto-generated method stub
		
		driver = BrowserTypes.getDriver();
				
		TestApplication testApp = new TestApplication();
		SeleniumTestContext seleniumContext = new SeleniumTestContext();
		seleniumContext.setDriver(driver);
		testApp.setTestContext(seleniumContext);	
		
		driver.get(application);
				
		return testApp;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		driver.quit();
	}
}
