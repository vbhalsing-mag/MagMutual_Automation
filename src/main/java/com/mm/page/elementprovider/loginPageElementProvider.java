package com.mm.page.elementprovider;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

public class loginPageElementProvider extends PageElementProvider{
	SeleniumElementProvider seleniumElementProvider; 
	
	public loginPageElementProvider(ITestContext iTestContext) {
		// TODO Auto-generated constructor stub
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}
	
	public Object getUserNameTextBox() {
        return seleniumElementProvider.getElementByName("j_username");
    }
	
	public Object getPasswordTextBox() {
        return seleniumElementProvider.getElementByName("j_password");
    }
	
	public Object getLoginBtn() {
        return seleniumElementProvider.getElementByName("btnSearch");
    }
}
