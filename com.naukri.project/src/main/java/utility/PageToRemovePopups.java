package utility;

import java.util.Set;

public class PageToRemovePopups extends Browserfactory{
	
	public void page() throws Throwable
	{
        String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) 
		{
			if (!windowHandle.equals(parentWindow))
			{
				driver.switchTo().window(windowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}
	
}
	
