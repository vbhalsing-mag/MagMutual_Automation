package com.mm.page.elementprovider;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

public class CISCreateNewOrgPageElementProvider extends PageElementProvider{
	
	public CISCreateNewOrgPageElementProvider(ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}

	SeleniumElementProvider seleniumElementProvider; 
	
	public Object getCISOrgName(){
		return seleniumElementProvider.getElementByName("entity_organizationName");
	}
	
	public Object getOrgLongName(){
		return seleniumElementProvider.getElementByName("entity_veryLongName");
	}
	
	public Object getaddType(){
		return seleniumElementProvider.getElementByName("address_addressTypeCode");
	}
	public Object getaddLine1(){
		return seleniumElementProvider.getElementByName("address_addressLine1");
	}
	public Object getaddLine2(){
		return seleniumElementProvider.getElementByName("address_addressLine2");
	}
	public Object getaddLine3(){
		return seleniumElementProvider.getElementByName("address_addressLine3");
	}
	public Object getcityName(){
		return seleniumElementProvider.getElementByName("address_city");
	}
	public Object getstate(){
		return seleniumElementProvider.getElementByName("address_stateCode");
	}
	public Object getZipCode(){
		return seleniumElementProvider.getElementByXpath("//input[@value='30004']");
	}
	public Object getOkBtn(){
		return seleniumElementProvider.getElementByXpath("//input[@type='button' and @value='OK']");
	}
	public Object getPhnNo(){
		return seleniumElementProvider.getElementByName("phoneNumber_phoneNumber_DISP_ONLY");
	}
	public Object getAreaCode(){
		return seleniumElementProvider.getElementByName("phoneNumber_areaCode");
	}
	public Object getClassification(){
		return seleniumElementProvider.getElementByName("entityClass_entityClassCode");
	}
	public Object getEffectToDate(){
		return seleniumElementProvider.getElementByName("entityClass_effectiveToDate");
	}
	public Object getSaveBtn(){
		return seleniumElementProvider.getElementByID("CI_ENTADDOU_SAV");
	}
	
}
