package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.Listeners;

import genericUtility.BassClass;
import genericUtility.ListenerUtility;
import objectRepository.Homepage;
@Listeners(ListenerUtility.class)
public class Books extends BassClass {
	
	@Test
	public void BooksLink() throws EncryptedDocumentException, IOException
	{
		hp= new Homepage(driver);
		hp.getBooksLink().click();
		Ass.assertEquals(driver.getCurrentUrl(), Futil.getPropertyfromproperties("url") ,Eutil.getdatafromexcel("Sheet1",1,7));
		etest.log(Status.PASS, "Books page is Displayed");
		Reporter.log("log");
		Reporter.log("log", true);
	}

}
