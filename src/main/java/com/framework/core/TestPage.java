/**
 * Core for Generic Pages
 */
package com.framework.core;

/**
 * @author surendrane
 *
 */
public abstract class TestPage {
	
	protected ITestContext textContext;
	
	
	public ITestContext getTestContext() {
		return textContext;
	}


	public void setTextContext(ITestContext textContext) {
		this.textContext = textContext;
	}


	public TestPage(ITestContext context)
	{
		this.textContext = context;
	}
	
	public void takeScreenShot(String title)
	{
		getTestContext().takeScreenShot(title);
	}
	
	public abstract void intializeElementProvider();
	
}
