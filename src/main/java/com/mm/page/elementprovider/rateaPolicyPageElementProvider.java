package com.mm.page.elementprovider;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.core.TestPage;
import com.framework.selenium.SeleniumElementProvider;

public class rateaPolicyPageElementProvider extends PageElementProvider {
	

	public rateaPolicyPageElementProvider(ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}
	static SeleniumElementProvider seleniumElementProvider;
	
	public Object getPolicyTab(){
		return seleniumElementProvider.getElementByXpath("//li[@id='Policy']//a[@class='fNiv']");
	}
	public Object getPolicySearch(){
		return seleniumElementProvider.getElementByName("globalSearch");
	}
	public Object getSearchBtn(){
		return seleniumElementProvider.getElementByName("search");
	}
	public Object getRateBtn(){
		return seleniumElementProvider.getElementByID("PM_COMMON_TABS_RATE");
	}
	public static Object getSavingOption(){
		return seleniumElementProvider.getElementByName("483865737.confirmed");
	}
	public Object getCloseBtn(){
		return seleniumElementProvider.getElementByID("PM_NOTIFY_CLOSE");
	}
	public Object getPremiumViewCloseBtn(){
		return seleniumElementProvider.getElementByID("PM_VIEW_PREM_CLOSE");
	}
	public Object getExitOk(){
		return seleniumElementProvider.getElementByName("workflowExit_Ok");
	}
	public Object checkFrameDisplayed()
	{
		return seleniumElementProvider.getElementByID("newpopup1");
	}
	
	public Object getClassErrMsg()
	{
		return seleniumElementProvider.getElementByXpath("//td[@class='errormessage']");
	}
	public Object getExportLink() {
		// TODO Auto-generated method stub
		return seleniumElementProvider.getElementByName("btnSaveAsCSV");
	}
	
	public Object getLogoutBtn() {
		// TODO Auto-generated method stub
		return seleniumElementProvider.getElementByName("logoff");
	}
}
