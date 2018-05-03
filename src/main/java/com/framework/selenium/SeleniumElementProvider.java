/**
 * 
 */
package com.framework.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.framework.core.ITestContext;
import com.framework.core.ToolElementProvider;


/**
 * @author surendrane
 *
 */
public class SeleniumElementProvider extends ToolElementProvider{

	SeleniumTestContext _seleniumContext;
		
	public SeleniumElementProvider(ITestContext context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		_seleniumContext = (SeleniumTestContext) context;
	}
	
	@Override
	public Object getElementByID(String id) {
		// TODO Auto-generated method stub	
		return _seleniumContext.getDriver().findElement(By.id(id));
	}

	@Override
	public Object getElementByName(String name) {
		// TODO Auto-generated method stub
		return _seleniumContext.getDriver().findElement(By.name(name));
	}
	
	public Object getElementByXpath(String xpath)
	{
		return _seleniumContext.getDriver().findElement(By.xpath(xpath));
	}
	
	public List<Object> getElementsByXpath(String xpath)
    {
	    final List<Object> elements = new ArrayList<Object>();
	    for(Object object : _seleniumContext.getDriver().findElements(By.xpath(xpath)))
	    {
	        elements.add(object); 
	    }
        return elements;
    }
	
	public Object getElementByLinkText(String linkText)
	{
		return _seleniumContext.getDriver().findElement(By.linkText(linkText));
	}
}
