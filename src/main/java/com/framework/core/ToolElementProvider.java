/**
 * 
 */
package com.framework.core;

/**
 * @author surendrane
 *
 */
public abstract class ToolElementProvider {
	
	public ToolElementProvider(ITestContext context)
	{		
	}
	
	public abstract Object getElementByID(String id);
	public abstract Object getElementByName(String name);
}
