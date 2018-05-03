/**
 *
 */
package com.framework.reporter;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.framework.core.TestApplication;
import com.framework.core.TestEngine;
import com.framework.selenium.SeleniumTestEngine;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author surendrane
 *
 */
public abstract class BaseTest {

	public TestEngine testEngine;

	public TestApplication testApp;

	@BeforeMethod
	public void setUp() {
		testEngine = new SeleniumTestEngine();
		//testApp = testEngine.start("http://172.18.1.107:9080/magsoasisqa/CS/login.jsp");
		testApp = testEngine.start("http://oasiscloud2017t:8081/oas17bts/CS/login.jsp");

	}

	protected ExtentReports extent;

	protected ExtentTest test;

	final String filePath = "MagMutualReport.html";

	@AfterMethod
	protected void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
		} else {
			test.log(LogStatus.PASS, "Test passed");
		}

		extent.endTest(test);
		extent.flush();
		//testEngine.stop();
	}

	@BeforeSuite
	public void beforeSuite() {
		extent = ExtentManager.getReporter(filePath);
	}

	@AfterSuite
	protected void afterSuite() {
		extent.close();
	}

	/*@AfterMethod
	public void tearDown() {
		testEngine.stop();
	}*/

	public void waitForPageToLoad() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to assertBooleanValues,
	 *
	 * @param bool | Boolean value to assert
	 */
	public void booleanAssertion(boolean bool, String passMessage, String failMessage) {

		Assert.assertTrue(bool, failMessage);
		// If statement to log the results
		if (bool) {
			test.log(LogStatus.PASS, passMessage);
		} else {
			test.log(LogStatus.FAIL, failMessage);
		}
	}
}
