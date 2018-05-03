package NA_com.gndtech.page.objects;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;

import NA_com.gndtech.page.elementproviders.CreatePullRequestPageElementProvider;

/**
 * This class provides functional methods required on Create PullRequest Page.
 *
 */
public class CreatePullRequestPage extends TestPage{

	ITestContext iTestContext;
	CreatePullRequestPageElementProvider createPullRequestPageElementProvider;

	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public CreatePullRequestPage(final ITestContext iTestContext) {
		super(iTestContext);
		this.iTestContext = iTestContext;
	}

	/**
	 * This method is to set value in Running sequence No.
	 * @param textValue
	 */
	public void setRunningSequenceNoValue(final String textValue)
	{
	    iTestContext.enterTextIn(createPullRequestPageElementProvider.getRunningSequenceNoTextBox(), textValue);
	}
	
	/**
	 * This method is to set value in customer ID
	 * @param textValue
	 */
	public void setCustomerIdValue(final String textValue)
    {
        iTestContext.enterTextIn(createPullRequestPageElementProvider.getCustomerIdTextBox(), textValue);
    }
	
	/**
	 * This method is to set value in pull Request description 
	 * @param textValue
	 */
	public void setPullRequestDescriptionValue(final String textValue)
    {
        iTestContext.enterTextIn(createPullRequestPageElementProvider.getPullRequestDescriptionTextBox(), textValue);
    }
	
	/**
	 * This method is to set value in account no.
	 * @param textValue
	 */
	public void setAccountNoValue(final String textValue)
    {
        iTestContext.enterTextIn(createPullRequestPageElementProvider.getAccountNoTextBox(), textValue);
    }
	
	/**
	 * This method is to set pull type value
	 * @param textValue
	 */
	public void setPullTypeValue(final String textValue)
    {
        iTestContext.enterTextIn(createPullRequestPageElementProvider.getPullTypeTextBox(), textValue);
    }
	
	/**
	 * This method is to set value in the validity box.
	 * @param textValue
	 */
	public void setValidityValue(final String textValue)
	    {
	        iTestContext.enterTextIn(createPullRequestPageElementProvider.getValidityBox(), "");
	        iTestContext.enterTextIn(createPullRequestPageElementProvider.getValidityBox(), textValue);
	    }
	
	/**
	 * This method is to click on submit button.
	 */
	public void clickSubmitButton()
	{
	    iTestContext.clickButton(createPullRequestPageElementProvider.getSubmitButton());
	}
	
	/**
	 * This method is to click on cancel button.
	 */
	public void clickCancelButton()
	{
	    iTestContext.clickButton(createPullRequestPageElementProvider.getCancelButton());
	}
	
	/**
	 * This method is to click on the pull description dropdown value
	 */
	public void selectPullRequestDescriptionValue() {
	    iTestContext.click(createPullRequestPageElementProvider.getPullRequestDescriptionItem());
	}
	
	/**
	 * This method is to click on the pull type dropdown value.
	 */
	public void selectPullTypeValue() {
        iTestContext.click(createPullRequestPageElementProvider.getPullTypeItem());
    }
	
	/**
	 * This method is to set value in the shipping address
	 * @param address
	 */
	public void setShippingAddressvalue(final String address) {
	    iTestContext.enterTextIn(createPullRequestPageElementProvider.getShippingAddressTextBox(), address);
	}
	
	/**
	 * This method is to set value in the comments.
	 * @param comments
	 */
	public void setComments(final String comments) {
	    iTestContext.enterTextIn(createPullRequestPageElementProvider.getCommentsTextBox(), comments);
	}
	
	 /**
     * This method is to get text of 'Create Pull For '
     * @return Text
     */
	public String getCreatePullForText() {	   
	    return iTestContext.getText(createPullRequestPageElementProvider.getCreatePullForText());
	}

    @Override
    public void intializeElementProvider() {
        createPullRequestPageElementProvider = new CreatePullRequestPageElementProvider(iTestContext);        
    }
	

}
