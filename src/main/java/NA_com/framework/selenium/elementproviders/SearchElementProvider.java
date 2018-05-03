/**
 * 
 */
package NA_com.framework.selenium.elementproviders;

import com.framework.core.ITestContext;
import com.framework.core.PageElementProvider;
import com.framework.selenium.SeleniumElementProvider;

/**
 * @author surendrane
 *
 */
public class SearchElementProvider extends PageElementProvider{

	public SearchElementProvider(ITestContext context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		_localElementProvider = new SeleniumElementProvider(context);
	}

	SeleniumElementProvider _localElementProvider;
	
	public Object SearchTextBox() 
	{
		// TODO Auto-generated method stub
		return _localElementProvider.getElementByID("lst-ib");
	}
	
	public Object SearchButton()
	{
		return _localElementProvider.getElementByName("btnG");
	}
	
	public Object DownloadsLink()
	{
		return _localElementProvider.getElementByLinkText("Downloads - Selenium");	
	}
}
