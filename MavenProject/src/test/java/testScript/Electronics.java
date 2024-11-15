package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BassClass;

public class Electronics extends BassClass {
	
	@Test
	public void ElectronicsLink()
	{
		hp.getElectronicsLink();
		Ass.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/electronics", "electronics page is Not Displayed");
		Reporter.log("electronics page is Displayed");
	}

}

