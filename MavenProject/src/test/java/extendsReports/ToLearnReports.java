package extendsReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnReports {
	
	@Test
	public void Report()
	{
		String TimeStamp = LocalDateTime.now().toString().replace(":", "-");
		
		ExtentSparkReporter Spark = new ExtentSparkReporter("./HTML_REPORT/extentReport_"+TimeStamp+".html");
		
		ExtentReports extReport = new ExtentReports();
		
		extReport.attachReporter(Spark);
		
		ExtentTest test = extReport.createTest("Report");
		
		test.log(Status.PASS, "intha Test case passed daa mapla");
		
		extReport.flush();
	}

}
