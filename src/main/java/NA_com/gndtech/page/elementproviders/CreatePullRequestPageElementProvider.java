package NA_com.gndtech.page.elementproviders;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

/**
 * This class provides create pull request page element.
 *
 */
public class CreatePullRequestPageElementProvider extends PageElementProvider{

	SeleniumElementProvider seleniumElementProvider;
	/**
	 * Constructor.
	 * @param iTestContext
	 */
	public CreatePullRequestPageElementProvider(ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}	
	/**
     * This method is used to get 'Running Sequence No' TextBox
     * @return Running Sequence No textBox
     */
    public Object getRunningSequenceNoTextBox() {
        return seleniumElementProvider.getElementByXpath("//input[@formcontrolname='runningSequenceNumber']");
    }
    
    /**
     * This method is used to get 'CustomerId' TextBox
     * @return CustomerId textBox
     */
    public Object getCustomerIdTextBox() {
        return seleniumElementProvider.getElementByXpath("//input[@formcontrolname='customerId']");
    }
    
    /**
     * This method is used to get 'AccountNo No' TextBox
     * @return Account No textBox
     */
    public Object getAccountNoTextBox() {
        return seleniumElementProvider.getElementByXpath("//input[@formcontrolname='accountNumber']");
    }
    
    /**
     * This method is used to get 'PullRequestDescription' TextBox
     * @return PullRequestDescription textBox
     */
    public Object getPullRequestDescriptionTextBox() {
        return seleniumElementProvider.getElementByXpath( "//select[@id='pullRequestDescription']");
    }
    
    /**
     * This method is to get pull Request Description item from drop down
     * @return Drop down value
     */
    public Object getPullRequestDescriptionItem() {
        return seleniumElementProvider.getElementByXpath( "//select[@id='pullRequestDescription']/child::option[2]");
    }
    /**
     * This method is used to get 'PullType' TextBox
     * @return PullType textBox
     */
    public Object getPullTypeTextBox() {
        return seleniumElementProvider.getElementByXpath( "//select[@id='pullRequestType']");
    }
    
    /**
     * This method is to get 'PullType' item
     * @return drop down value.
     */
    public Object getPullTypeItem() {
        return seleniumElementProvider.getElementByXpath( "//select[@id='pullRequestType']/child::option[6]");
    }
    
    /**
     * This method is used to get 'Validity' TextBox
     * @return Validity textBox
     */
    public Object getValidityBox() {
        return seleniumElementProvider.getElementByXpath( "//input[@formcontrolname='validity']");
    }
    
    /**
     * This method is used to get 'Submit' Button
     * @return Submit Button
     */
    public Object getSubmitButton() {
        return seleniumElementProvider.getElementByXpath("//button[text()='Submit']");
    }
    
    /**
     * This method is used to get 'Cancel' Button
     * @return Cancel Button
     */
    public Object getCancelButton() {
        return seleniumElementProvider.getElementByXpath("//button[text()='Cancel']");
    }
    
    /**
     * This method is used to get shipping address Texbox
     * @return Text box.
     */
    public Object getShippingAddressTextBox() {
        return seleniumElementProvider.getElementByXpath("//textarea[@formcontrolname='shippingAddress']");
    }
    
    /**
     * This method is used to get comments text box.
     * @return Text box.
     */
    public Object getCommentsTextBox() {
        return seleniumElementProvider.getElementByXpath("//textarea[@formcontrolname='comments']");
    } 
    
    /**
     * This method is to get text of 'Create Pull For '
     * @return Text
     */
    public Object getCreatePullForText() {
        return seleniumElementProvider.getElementByXpath("//label[text()='Create Pull for ']");
    }
    
}
