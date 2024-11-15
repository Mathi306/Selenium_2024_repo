package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BassClass;

public class GiftCards extends BassClass {
	
	@Test
	public void GiftCardsLink()
	{
		hp.getGiftcardsLink();
		Ass.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/GiftCards", "Books page is Not Displayed");
		Reporter.log("GiftCardspage is Displayed");
	}

}

