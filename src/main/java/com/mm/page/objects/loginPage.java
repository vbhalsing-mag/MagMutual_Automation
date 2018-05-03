package com.mm.page.objects;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;
import com.mm.page.elementprovider.loginPageElementProvider;

public class loginPage extends TestPage{

	public loginPage(ITestContext context) {
		super(context);
		this.iTestContext = context;
	}
	
	ITestContext iTestContext;
	loginPageElementProvider loginpgElemProvider;
	
	@Override
	public void intializeElementProvider() {
		loginpgElemProvider = new loginPageElementProvider(iTestContext);
	}
	
	public void loginToApplication() throws InterruptedException
	{
		iTestContext.enterTextIn(loginpgElemProvider.getUserNameTextBox(), "vbhalsing");
		Thread.sleep(4000);
		iTestContext.enterTextIn(loginpgElemProvider.getPasswordTextBox(), "M@G824829");
		Thread.sleep(3000);
		iTestContext.clickButton(loginpgElemProvider.getLoginBtn());
	}

}
