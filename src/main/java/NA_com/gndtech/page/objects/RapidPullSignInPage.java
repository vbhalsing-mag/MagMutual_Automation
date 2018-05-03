package NA_com.gndtech.page.objects;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;

import NA_com.gndtech.page.elementproviders.RapidPullSignInPageElementProvider;

/**
 * This class provides functional methods required on sign in page.
 *
 */
public class RapidPullSignInPage extends TestPage{

	ITestContext iTestContext;
	RapidPullSignInPageElementProvider rapidPullSignInPageElementProvider;

	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public RapidPullSignInPage(ITestContext iTestContext) {
		super(iTestContext);
		this.iTestContext = iTestContext;
	}

	/**
	 * This method is to check whether the page is loaded or not
	 * @return boolean
	 */
	public boolean isPageLoaded() {
		return iTestContext.getPageTitle().equalsIgnoreCase("MVP");
	}

	/**
	 * This method is used to sign in to application.
	 * @param username username
	 * @param password password
	 */
	public void signIn(final String username, final String password) {
		iTestContext.enterTextIn(rapidPullSignInPageElementProvider.getUserNameTextBox(), username);
		iTestContext.enterTextIn(rapidPullSignInPageElementProvider.getPasswordTextBox(), password);
		iTestContext.clickButton(rapidPullSignInPageElementProvider.getSignButton());
	}

	/**
	 * This method is used to get 'Forgot password' link text.
	 * @return link text
	 */
	public String getForgotPasswordLinkText() {
		return iTestContext.getText(rapidPullSignInPageElementProvider.getForgotPasswordLink());
	}

	/**
	 * This method is used to get 'Need Help Signing' link text.
	 * @return link text
	 */
	public String getNeedHelpSigningLinkText() {
		return iTestContext.getText(rapidPullSignInPageElementProvider.getNeedHelpSigningInLink());
	}

	/**
	 * This method is used to get 'User Manual' link text.
	 * @return link text
	 */
	public String getUserManualLinkText() {
		return iTestContext.getText(rapidPullSignInPageElementProvider.getUserManualLink());
	}

	/**
	 * This method is used to get 'Sign In' label text.
	 * @return label
	 */
	public String getSignInLabelText() {
		return iTestContext.getText(rapidPullSignInPageElementProvider.getSignInLabel());
	}

    @Override
    public void intializeElementProvider() {
        rapidPullSignInPageElementProvider = new RapidPullSignInPageElementProvider(iTestContext);      
    }
}
