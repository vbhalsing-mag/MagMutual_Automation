/**
 * Test Application class would
 * initialize context and return page object
 */
package com.framework.core;

import java.lang.reflect.InvocationTargetException;


/**
 * @author surendrane
 *
 */
public class TestApplication {
	
	public ITestContext testContext;

	public ITestContext getTestContext() {
		return testContext;
	}

	public void setTestContext(ITestContext testContext) {
		this.testContext = testContext;
	}
	 
	@SuppressWarnings("unchecked")
	public <T extends TestPage> T getInstance(Class<?> TestPage)
	{
		T page = null;

		try {
							
			page = (T) TestPage.getConstructor(ITestContext.class).newInstance(testContext);
			page.intializeElementProvider();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return page;
	}
	
}
