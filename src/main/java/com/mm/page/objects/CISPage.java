package com.mm.page.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;
import com.mm.page.elementprovider.CISCreateNewOrgPageElementProvider;
import com.mm.page.elementprovider.homePageElementProvider;
import com.mm.page.elementprovider.rateaPolicyPageElementProvider;
import com.mm.utils.commonUtilities;

public class CISPage extends TestPage {

	public CISPage(ITestContext context) {
		super(context);
		this.iTestContext = context;
	}
	ITestContext iTestContext;
	commonUtilities commutil;
	CISCreateNewOrgPageElementProvider CISPageElementProvider;
	homePageElementProvider homePageEleProvider;
	rateaPolicyPageElementProvider rateAPolicyElemPro;
	rateaPolicyPage ratePolicy;
	String Org_Long_Name = "Automation testing organisation Test Long name of the";
	String AddrL1="14515 Birmingham Hwy";
	String City = "Alpharetta";
	String toDate ="10/12/2025";
	
	@Override
	public void intializeElementProvider() {
		
		CISPageElementProvider = new CISCreateNewOrgPageElementProvider(iTestContext);
	
		homePageEleProvider = new homePageElementProvider(iTestContext);
	}
	
	
	public void CIS_CreateNewOrg() throws InterruptedException{
		
				
		iTestContext.click(homePageEleProvider.getCISById());	  // Add in test case.
		Thread.sleep(2000);
		
		iTestContext.click(homePageEleProvider.getCISNewOrgById());
		Thread.sleep(2000);
		
		iTestContext.enterTextIn(CISPageElementProvider.getOrgLongName(), Org_Long_Name);
		
		iTestContext.click(CISPageElementProvider.getCISOrgName());
		
		Thread.sleep(2000);
		
		WebElement policyType = (WebElement) CISPageElementProvider.getaddType();
		
		/*Select Sel = new Select(policyType);
		Sel.selectByValue("POLICY");*/

		commutil = new commonUtilities();
		commutil.selectDropdown(policyType, "POLICY");
		
		iTestContext.enterTextIn(CISPageElementProvider.getaddLine1(),AddrL1);
		
		iTestContext.enterTextIn(CISPageElementProvider.getcityName(),City);
		
		WebElement Classification = (WebElement) CISPageElementProvider.getClassification();
		
		commutil.selectDropdown(Classification,"CARRIER");
		
		iTestContext.enterTextIn(CISPageElementProvider.getEffectToDate(), toDate);
		
		Thread.sleep(1000);
		
		WebElement state = (WebElement) CISPageElementProvider.getstate();
		
		/*Select Sel1 = new Select(state);
		Sel1.selectByValue("GA");*/
		
		commutil.selectDropdown(state, "GA");
		
        iTestContext.switchWindow();
		
        WebElement zip = (WebElement) CISPageElementProvider.getZipCode();
              	   
 	    JavascriptExecutor executor = (JavascriptExecutor) iTestContext;
        executor.executeScript("arguments[0].click();", zip);
        
        iTestContext.click(CISPageElementProvider.getOkBtn());
        
        Thread.sleep(3000);

		iTestContext.click(CISPageElementProvider.getSaveBtn());
		
		ratePolicy.logout();	
		
	}

}
