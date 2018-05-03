package com.mm.page.elementprovider;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

public class homePageElementProvider extends PageElementProvider{

	public homePageElementProvider(ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}
	SeleniumElementProvider seleniumElementProvider;
	
	public Object getCISById()
	{
		return seleniumElementProvider.getElementByID("CIS");
	}
	
	public Object getCISNewOrgById()
	{
		return seleniumElementProvider.getElementByID("CI_NEW_ORG");
		
	}
	

}
