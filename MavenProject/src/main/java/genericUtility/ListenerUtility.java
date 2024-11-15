package genericUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;

public class ListenerUtility extends BassClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
	    etest = Ereport.createTest(result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
	etest.log(Status.PASS, "Pages Displayed Successfully");
	}
	
	
	
	
	

}
