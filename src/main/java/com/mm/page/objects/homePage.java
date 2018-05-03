package com.mm.page.objects;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;
import com.mm.page.elementprovider.homePageElementProvider;

public class homePage extends TestPage{

	public homePage(ITestContext context) {
		super(context);
		this.iTestContext = context;
	}
	
	ITestContext iTestContext;
	homePageElementProvider homePageEleProvider;
	
	@Override
	public void intializeElementProvider() {
		homePageEleProvider = new homePageElementProvider(iTestContext);
	}
	
	
	public void navigateToCISPage() throws InterruptedException
	{
		iTestContext.click(homePageEleProvider.getCISById());
		Thread.sleep(2000);
		iTestContext.click(homePageEleProvider.getCISNewOrgById());
		
	}
}
