package NA_com.gndtech.page.elementproviders;

import java.util.List;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

/**
 * This class provides Pull manager page element.
 *
 */
public class PullManagerPageElementProvider extends PageElementProvider{

	SeleniumElementProvider seleniumElementProvider;

	/**
	 * Constructor.
	 * @param iTestContext iTestContext
	 */
	public PullManagerPageElementProvider(ITestContext iTestContext) {
		super(iTestContext);
		seleniumElementProvider = new SeleniumElementProvider(iTestContext);
	}
	
	   /**
     * This method is used to get 'Create Pull Request' button.
     * @return Create Pull Request button
     */
    public Object getCreatePullRequestButton()
    {
        return seleniumElementProvider.getElementByXpath("//div[@class='text-right']/button[text()='Create Pull Request']");
    }

    
    /**
     * This method is to get Search TextBox
     * @return Search Text Box.
     */
    public Object getSearchTextBox()
    {
        return seleniumElementProvider.getElementByXpath("//div[@class='searchpanel']//input[@id='global-search']");
    }
    
    /**
     * This method is to get all values of the table
     * @return Table Value.
     */
    public List<Object> getTableValue()
    {
        return seleniumElementProvider.getElementsByXpath("//table[contains(@class,'table')]/tbody/tr");
    }
    
    /**
     * This method is get pull id 'Sort Button'
     * @return
     */
    public Object getPullIDSortButton() {
        return seleniumElementProvider.getElementByXpath("width80>div>span>span");
    } 

}
