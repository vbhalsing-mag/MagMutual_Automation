package NA_com.gndtech.page.elementproviders;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

/**
 * This class provides Pull Confirmation page element.
 *
 */
public class PullConfirmationPageElementProvider extends PageElementProvider{

	SeleniumElementProvider seleniumElementProvider;

	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public PullConfirmationPageElementProvider(ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}


	/**
	 * This method is used to get 'Create Pull' button.
	 * @return Create Pull button
	 */
	public Object getCreatePullButton()
	{
		return seleniumElementProvider.getElementByID("SubmitLogin");
	}

	/**
	 * This method is used to get 'Cancel' button.
	 * @return Cancel button
	 */
	public Object getCancelButton()
	{
		return seleniumElementProvider.getElementByID("cancel");
	}
	
	  /**
     * This method is used to get 'Submit' Button from running sequence No popup
     * @return Submit Button
     */
    public Object getConfirmPopupSubmitButton() {
        return seleniumElementProvider.getElementByXpath("//div[@class='confirmModal']//button[@type='submit']");
    }
    
    /**
     * This method is used to text 'Confirm create pull'
     * @return Text
     */
    public Object getConfirmCreatePullText() {
        return seleniumElementProvider.getElementByXpath("//h4[text()='Confirm Create Pull']");
    }
}
