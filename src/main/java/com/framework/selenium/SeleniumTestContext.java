/**
 * 
 */
package com.framework.selenium;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.core.ITestContext;

/**
 * @author surendrane
 *
 */
public class SeleniumTestContext implements ITestContext{
	
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateTo(String url) {
		// TODO Auto-generated method stub
		
		driver.get(url);
	}

	public void enterTextIn(Object pageElement, String text) {
		// TODO Auto-generated method stub
		
		((WebElement)pageElement).sendKeys(text);
	}

	public void clickButton(Object pageElement) {
		// TODO Auto-generated method stub
		
		((WebElement)pageElement).click();
	}

	public void waitFor(long ms) {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void takeScreenShot(String pageTitle) {
		// TODO Auto-generated method stub
		try
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(pageTitle));
			
		}catch(Exception e){}	
	}
	
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public String getText(Object pageElement) {
		// TODO Auto-generated method stub
		return ((WebElement)pageElement).getText();
	}

	public void clearTextBox(Object pageElement) {
		((WebElement)pageElement).clear();
	}

	public String getAttributeValue(Object pageElement, String attributeName) {
		return ((WebElement)pageElement).getAttribute(attributeName);
	}

	public void click(Object pageElement) {
		((WebElement)pageElement).click();	
	}

	public void clear(Object pageElement) {
		((WebElement)pageElement).clear();
	}


	public void switchToFrame(String uniqFrameId) {
		driver.switchTo().frame(uniqFrameId);		
	}
	
	public void visibilityOfElement(Object pageElement) {
		// TODO Auto-generated method stub
		
	}
	
	public void switchWindow()
	{
		Set<String> handles = driver.getWindowHandles();      //Return a set of window handle
		 
	    String parentWindow = driver.getWindowHandle();
	   
	    for(String currentWindow : handles){
	    	   if(!currentWindow.equals(parentWindow))
	    	  {
	    	   driver.switchTo().window(currentWindow);
	    	  }
	    	   
	    }
	}
	
	
}
