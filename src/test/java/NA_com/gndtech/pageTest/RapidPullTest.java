package NA_com.gndtech.pageTest;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import com.framework.reporter.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import NA_com.gndtech.page.constants.RapidPullConstants;
import NA_com.gndtech.page.objects.CreatePullRequestPage;
import NA_com.gndtech.page.objects.PullConfirmationPage;
import NA_com.gndtech.page.objects.PullManagerPage;
import NA_com.gndtech.page.objects.RapidPullSignInPage;

public class RapidPullTest extends BaseTest {

    /**
     * This test case is to verify login functionality of the rapid pull application.
     */
    @Test(priority = 1)
    public void verifyLoginFunctionality() {
        test = extent.startTest("verify Login Functionality");
        final RapidPullSignInPage rapidPullSignInPage = testApp.getInstance(RapidPullSignInPage.class);

        // Verify Valid Sign In
        test.log(LogStatus.INFO, "Verify Valid Sign In");
        rapidPullSignInPage.signIn(RapidPullConstants.ADMIN_USER, RapidPullConstants.ADMIN_USER);
        waitForPageToLoad();
        VerifyLoginFunction();
    }

    /**
     * This test case is to verify pull request functionality.
     */
    @Test(priority = 2)
    public void verifyCreatePullRequestFunctionality() {
        test = extent.startTest("verify Create Pull Request Functionality");
        final RapidPullSignInPage rapidPullSignInPage = testApp.getInstance(RapidPullSignInPage.class);

        // Verify Valid Sign In
        test.log(LogStatus.INFO, "Verify Valid Sign In");
        rapidPullSignInPage.signIn(RapidPullConstants.ADMIN_USER, RapidPullConstants.ADMIN_USER);
        waitForPageToLoad();
        final PullManagerPage pullManagerPage = testApp.getInstance(PullManagerPage.class);
        final boolean isLoginSuccessful = pullManagerPage.getPullManagerWindowTitle()
                .contains(RapidPullConstants.MVP);
        booleanAssertion(isLoginSuccessful, "Sign In Successful", "Sign In Unsuccessful");
        waitForPageToLoad();
        pullManagerPage.clickCreatePullRequestButton();
        waitForPageToLoad();
        test.log(LogStatus.INFO, "Verify Create Pull Request Screen");      
        
        // Verify Create Pull Request Screen       
        VerifyCreatePullRequestFunction();        
        test.log(LogStatus.INFO, "Verify Create Pull Request Confirmation"); 
        
        final CreatePullRequestPage createPullRequestPage = testApp.getInstance(CreatePullRequestPage.class);
        createPullRequestPage.setRunningSequenceNoValue(RandomStringUtils.randomNumeric(9));
        createPullRequestPage.setCustomerIdValue(RandomStringUtils.randomNumeric(9));
        final String accountNumber = RandomStringUtils.randomNumeric(11);
        createPullRequestPage.setAccountNoValue(accountNumber);
        createPullRequestPage.selectPullRequestDescriptionValue();
        createPullRequestPage.selectPullTypeValue();
        createPullRequestPage.setValidityValue(RapidPullConstants.VALIDITY_VALUE);
        createPullRequestPage.setShippingAddressvalue(RapidPullConstants.SHIPPING_ADDRESS);
        createPullRequestPage.setComments(RapidPullConstants.COMMENTS);
        createPullRequestPage.clickSubmitButton();
        waitForPageToLoad(); 
        VerifyPullConfirmationFunction();
        
        final PullConfirmationPage pullConfirmationPage = testApp.getInstance(PullConfirmationPage.class);
        pullConfirmationPage.clickConfirmPopupSubmitButton();
        waitForPageToLoad();

        // Verify Create Pull Request Confirmation
        test.log(LogStatus.INFO, "Verify Created Pull Request on Pull Manager Window");
        pullManagerPage.enterValueInSearchTextBox(accountNumber);
        VerifyPullRequestCreationFunction();       
    }
    
    /**
     * This method will verify Sign in function
     */
    private void VerifyLoginFunction() {
        final PullManagerPage pullManagerPage = testApp.getInstance(PullManagerPage.class);
        final boolean isLoginSuccessful = pullManagerPage.getPullManagerWindowTitle()
                .contains(RapidPullConstants.MVP);
        booleanAssertion(isLoginSuccessful, "Sign In Successful", "Sign In Unsuccessful");
    }
    
    /**
     * This method will verify create pull request function
     */
    private void VerifyCreatePullRequestFunction() {
        final CreatePullRequestPage createPullRequestPage = testApp.getInstance(CreatePullRequestPage.class);
        final boolean isCreatePullRequestScreen = createPullRequestPage.getCreatePullForText().contains(RapidPullConstants.CREATE_PULL_FOR);
        booleanAssertion(isCreatePullRequestScreen, "Create Pull Request Screen displayed",
                "Create Pull Request Screen is not displayed");
    }
    
    /**
     * This method will verify pull confirmation request function
     */
    private void VerifyPullConfirmationFunction() {
        final PullConfirmationPage pullConfirmationPage = testApp.getInstance(PullConfirmationPage.class);
        final boolean isConfirmationWindow = pullConfirmationPage.getConfirmCreatePullText().contains(RapidPullConstants.CONFIRM_CREATE_PULL);
        booleanAssertion(isConfirmationWindow, "Pull Request confirmation window is displayed",
                "Pull Request confirmation window is not displayed"); 
    }
    
    /**
     * This method will verify pull request creation function.
     */
    private void VerifyPullRequestCreationFunction() {
        final PullManagerPage pullManagerPage = testApp.getInstance(PullManagerPage.class);
        final boolean isPullRequestCreated = pullManagerPage.getPullManagerTableRowCount() == 2;
        booleanAssertion(isPullRequestCreated, "Pull Request has been created Successfully",
                "Pull Request is not created");
    }
}
