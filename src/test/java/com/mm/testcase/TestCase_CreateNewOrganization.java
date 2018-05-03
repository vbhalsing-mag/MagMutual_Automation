package com.mm.testcase;


import org.testng.annotations.Test;

import com.framework.reporter.BaseTest;
import com.mm.page.objects.CISPage;
import com.mm.page.objects.loginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase_CreateNewOrganization extends BaseTest {
	
	loginPage loginpage;
	
	@Test
    public void createNewCISOrganization () throws InterruptedException{
    	final loginPage lp = testApp.getInstance(loginPage.class);
		test = extent.startTest("verify Create new CIS organization Functionality.");
		waitForPageToLoad();
		lp.loginToApplication();
		
		CISPage cispage = testApp.getInstance(CISPage.class);
		cispage.CIS_CreateNewOrg();
        
		
		
    }
	

}
