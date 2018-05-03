package com.mm.page.objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.framework.core.ITestContext;
import com.framework.core.TestPage;
import com.mm.page.elementprovider.CISCreateNewOrgPageElementProvider;
import com.mm.page.elementprovider.rateaPolicyPageElementProvider;
import com.mm.utils.commonUtilities;

public class rateaPolicyPage extends TestPage {

	public rateaPolicyPage(ITestContext context) {
		super(context);
		this.iTestContext = context;
	}
	
	ITestContext iTestContext;
	rateaPolicyPageElementProvider rateAPolicyElemPro;
	commonUtilities commUtil;
	String policyNo;
	WebElement policyLockErrMsg11;
	
	@Override
	public void intializeElementProvider() {
		rateAPolicyElemPro = new rateaPolicyPageElementProvider(iTestContext);
	}
	
	public void searchPolicy() throws InterruptedException{
		policyNo = "Q09101299-NB18-01";
		Thread.sleep(2000);
		iTestContext.click(rateAPolicyElemPro.getPolicyTab());//nw
		Thread.sleep(2000);
		iTestContext.clear(rateAPolicyElemPro.getPolicySearch());
		iTestContext.enterTextIn(rateAPolicyElemPro.getPolicySearch(),policyNo);//Q09101347-NB18-01
		iTestContext.clickButton(rateAPolicyElemPro.getSearchBtn());//nw
		Thread.sleep(3000);
	}
	
	public String isRateBtnDispayed() throws InterruptedException {
		try
		{
			policyLockErrMsg11 =(WebElement) rateAPolicyElemPro.getClassErrMsg();
			policyLockErrMsg11.isDisplayed();
			return "true";
		}catch(NoSuchElementException e)
		{
			return "false";
		}
	}
	public void searchRate() throws InterruptedException
	{
		if(isRateBtnDispayed().equals("true"))
		{
			
			Assert.assertEquals(policyLockErrMsg11.getText().contains("Policy is locked by another web session"), "This Policy No - "+policyNo+ " is currently locked, please check.");
		}
		else
		{
			//add logger here.
			Thread.sleep(2000);
			iTestContext.clickButton(rateAPolicyElemPro.getRateBtn());
			Thread.sleep(2000);
		}
	}
	
	public void productNotify() throws InterruptedException
	{
			iTestContext.switchToFrame("popupframe1");
			Thread.sleep(2000);
			WebElement savingOption = (WebElement) rateAPolicyElemPro.getSavingOption();
			Select Sel = new Select(savingOption);
			Sel.selectByValue("Y");
			iTestContext.clickButton(rateAPolicyElemPro.getCloseBtn());
	}
	
	public void premiumExcelDownload() throws AWTException
	{
		iTestContext.clickButton(rateAPolicyElemPro.getExportLink());
    	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 Robot rob = new Robot();
    	 
    	 rob.keyPress(KeyEvent.VK_F6);
    	 rob.keyRelease(KeyEvent.VK_F6);
    	 
    	 rob.setAutoDelay(1000);
    	 rob.keyPress(KeyEvent.VK_TAB);
    	 rob.keyRelease(KeyEvent.VK_TAB);
    	 
    	
    	 rob.setAutoDelay(1000);
    	 rob.keyPress(KeyEvent.VK_DOWN);
    	 
    	 rob.setAutoDelay(1000);
    	 rob.keyPress(KeyEvent.VK_DOWN);
    	 rob.keyRelease(KeyEvent.VK_DOWN);
    	 
    	 
    	 rob.setAutoDelay(1000);
    	 rob.keyPress(KeyEvent.VK_ENTER);
    	 rob.keyRelease(KeyEvent.VK_ENTER);
    	 
    	 DateFormat dateFormatter = new SimpleDateFormat("MMddyy");
 		 Date today = Calendar.getInstance().getTime();        
 		 String date= dateFormatter.format(today);
 		
 			
 		StringSelection sysDate = new StringSelection("C:\\MM_Testcase_Output\\"+date+"_"+RandomStringUtils.random(2,"abc1234567890")+".xlsx");
 		
 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sysDate, null);
 		
 		
 		rob.keyPress(KeyEvent.VK_CONTROL); 									    //press 'cntrl' key
		rob.keyPress(KeyEvent.VK_V);											//press 'V' key
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
 		
 		 rob.setAutoDelay(2000);
    	 rob.keyPress(KeyEvent.VK_ENTER);
    	 rob.keyRelease(KeyEvent.VK_ENTER);
 		
    	
    	 /* rob.keyPress(KeyEvent.VK_TAB);
    	 rob.keyRelease(KeyEvent.VK_TAB);*/

    	 iTestContext.click(rateAPolicyElemPro.getPremiumViewCloseBtn());
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 iTestContext.clickButton(rateAPolicyElemPro.getExitOk());
    	 
    	 //iTestContext.switchToFrame("defaultContent()");
    	 
    	 rob.keyPress(KeyEvent.VK_F6);
    	 rob.keyRelease(KeyEvent.VK_F6);
    	 
    	 rob.setAutoDelay(1000);
    	 rob.keyPress(KeyEvent.VK_TAB);
    	 rob.keyPress(KeyEvent.VK_TAB);
    	 rob.keyPress(KeyEvent.VK_TAB);
    	 rob.keyRelease(KeyEvent.VK_TAB);
    	 rob.setAutoDelay(1000);
    	 rob.keyPress(KeyEvent.VK_ENTER);
    	 rob.keyRelease(KeyEvent.VK_ENTER);
	}
	 public void logout()
	 {
		 //iTestContext.click(rateAPolicyElemPro.getLogoutBtn());
	 }
	
}
