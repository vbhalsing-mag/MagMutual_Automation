package NA_com.gndtech.page.elementproviders;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

/**
 * This class provides Sign In page element.
 *
 */
public class RapidPullSignInPageElementProvider extends PageElementProvider {

	SeleniumElementProvider seleniumElementProvider;
	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public RapidPullSignInPageElementProvider(final ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}

	/**
	 * This method is used to get sign in label.
	 * @return sign in label
	 */
	public Object getSignInLabel()
	{
		return seleniumElementProvider.getElementByID( "signIn");
	}

	/**
	 * This method is used to get username text box.
	 * @return username text box
	 */
	public Object getUserNameTextBox()
	{
		return seleniumElementProvider.getElementByName("username");
	}


	/**
	 * This method is used to get password text box.
	 * @return password text box
	 */
	public Object getPasswordTextBox()
	{
		return seleniumElementProvider.getElementByName("password");
	}

	/**
	 * This method is used to get 'Sign In' button.
	 * @return sign in button
	 */
	public Object getSignButton()
	{
		return seleniumElementProvider.getElementByXpath("//button[@type='submit']");
	}

	/**
	 * This method is used to get 'Need help signing in?' link.
	 * @return link
	 */
	public Object getNeedHelpSigningInLink()
	{
		return seleniumElementProvider.getElementByID("Need help signing in?");
	}

	/**
	 * This method is used to get 'Forgot password?' link.
	 * @return link
	 */
	public Object getForgotPasswordLink()
	{
		return seleniumElementProvider.getElementByID("Forgot password?");
	}

	/**
	 * This method is used to get 'User Manual' link.
	 * @return link
	 */
	public Object getUserManualLink()
	{
		return seleniumElementProvider.getElementByID("User Manual");
	}
}
