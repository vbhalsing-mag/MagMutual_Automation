package com.mm.testcase;

import org.testng.annotations.Test;

import com.framework.reporter.BaseTest;
import com.mm.page.objects.loginPage;
import com.relevantcodes.extentreports.LogStatus;

import NA_com.gndtech.page.constants.RapidPullConstants;
import NA_com.gndtech.page.objects.RapidPullSignInPage;

public class TestCase_loginToApplication extends BaseTest {
	
	 @Test(priority = 1)
	    public void verifyLoginFunctionality() throws InterruptedException {
	        test = extent.startTest("verify Login Functionality");
	        final loginPage lp = testApp.getInstance(loginPage.class);

	        // Verify Valid Sign In
	        test.log(LogStatus.INFO, "Verify Valid Sign In");
	        waitForPageToLoad();
	        lp.loginToApplication();
	        waitForPageToLoad();
	    }
}
