package NA_com.gndtech.page.objects;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;

import NA_com.gndtech.page.elementproviders.PullConfirmationPageElementProvider;

/**
 * This class provides functional methods required on pull confirmation Page.
 *
 */
public class PullConfirmationPage extends TestPage{

	ITestContext iTestContext;
	PullConfirmationPageElementProvider pullConfirmationPageElementProvider;

	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public PullConfirmationPage(ITestContext iTestContext) {
		super(iTestContext);
		this.iTestContext = iTestContext;
	}

	/**
	 * This method is used to click on create pull button on confirmation.
	 */
	public void clickCreatePullButton()
	{
		iTestContext.clickButton(pullConfirmationPageElementProvider.getCreatePullButton());
	}
	   
	/**
	 * This method will click on confirm popup submit button.
	 */
	public void clickConfirmPopupSubmitButton() {
        iTestContext.clickButton(pullConfirmationPageElementProvider.getConfirmPopupSubmitButton());
    }

	  /**
     * This method is used to text 'Confirm create pull'
     * @return Text
     */
	public String getConfirmCreatePullText() {
	    return iTestContext.getText(pullConfirmationPageElementProvider.getConfirmCreatePullText());
	}
    @Override
    public void intializeElementProvider() {
        pullConfirmationPageElementProvider = new PullConfirmationPageElementProvider(iTestContext);       
    }
    
	
}
