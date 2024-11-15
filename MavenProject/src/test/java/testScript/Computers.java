package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BassClass;
import genericUtility.ListenerUtility;
import objectRepository.Homepage;

@Listeners(ListenerUtility.class)
public class Computers extends BassClass {
	
	@Test
	public void ComputersLink() throws EncryptedDocumentException, IOException
	{
		hp=new Homepage(driver);
		hp.getComputersLink().click();
		Ass.assertEquals(driver.getTitle(), Eutil.getdatafromexcel("Sheet1",1,6), "computers page is Not Displayed");
		etest.log(Status.PASS, "Computers page is Displayed");
	}

}

