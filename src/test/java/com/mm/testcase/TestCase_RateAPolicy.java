package com.mm.testcase;

import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.Test;

import com.framework.reporter.BaseTest;
import com.mm.page.objects.homePage;
import com.mm.page.objects.loginPage;
import com.mm.page.objects.rateaPolicyPage;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase_RateAPolicy extends BaseTest{
	
	/*public void navigateToCIS() throws InterruptedException
	{
		test = extent.startTest("verify navigation to CIS page.");
        final homePage homepage = testApp.getInstance(homePage.class);
        test.log(LogStatus.INFO, "Verify navigation to CIS Page");
        homepage.navigateToCISPage();
	}*/
	
	loginPage loginpage;
	
	@Test
	public void ratePolicy() throws InterruptedException, AWTException{
		
		final loginPage lp = testApp.getInstance(loginPage.class);
		test = extent.startTest("verify Rate details Download Functionality");
		waitForPageToLoad();
		
		test.log(LogStatus.INFO, "Verify Valid Sign In");
		lp.loginToApplication();
		
		final rateaPolicyPage ratePolPage = testApp.getInstance(rateaPolicyPage.class);
		
		ratePolPage.searchPolicy();
		test.log(LogStatus.INFO, "Policy details found.");
		
		ratePolPage.searchRate();
		
		test.log(LogStatus.INFO, "Rate details found.");
		ratePolPage.productNotify();//applay if else condition
		test.log(LogStatus.INFO, "Rate details saved.");

		ratePolPage.premiumExcelDownload();
		test.log(LogStatus.INFO, "Rate premium details excel sheet download completed");
		
		test.log(LogStatus.INFO, "Logout from application.");
		ratePolPage.logout();
	}
}
