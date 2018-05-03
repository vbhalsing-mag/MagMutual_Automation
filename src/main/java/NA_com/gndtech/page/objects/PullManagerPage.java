package NA_com.gndtech.page.objects;

import com.framework.core.ITestContext;
import com.framework.core.TestPage;

import NA_com.gndtech.page.elementproviders.PullManagerPageElementProvider;

/**
 * This class provides functional methods required on Pull Manager Page.
 *
 */
public class PullManagerPage extends TestPage{

	ITestContext iTestContext;
	PullManagerPageElementProvider pullManagerPageElementProvider;

	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public PullManagerPage(ITestContext iTestContext) {
		super(iTestContext);
		this.iTestContext = iTestContext;
	}
	
	/**
     * This method is used to click on create pull request button.
     */
    public void clickCreatePullRequestButton()
    {
        iTestContext.clickButton(pullManagerPageElementProvider.getCreatePullRequestButton());
    }

    /**
     * This method is to enter value in the search text box
     * @param pullID
     */
    public void enterValueInSearchTextBox(final String value)  {
      
        iTestContext.enterTextIn(pullManagerPageElementProvider.getSearchTextBox(), value);
    }  
    
    /**
     * This method is to click on pull Id sort Button.
     */
    public void clickOnPullIDSortButton() {
        iTestContext.clickButton(pullManagerPageElementProvider.getPullIDSortButton());
    }
    
    /**
     * This method is to get pull manager table count
     * @return count
     */
    public int getPullManagerTableRowCount()
    {
        return pullManagerPageElementProvider.getTableValue().size();
    }

    @Override
    public void intializeElementProvider() {
        pullManagerPageElementProvider = new PullManagerPageElementProvider(iTestContext);
    }
    
    /**
     * This method is used to get page title for pull manager window.
     * @return title
     */
    public String getPullManagerWindowTitle()
    {
        return iTestContext.getPageTitle();
    }
}
