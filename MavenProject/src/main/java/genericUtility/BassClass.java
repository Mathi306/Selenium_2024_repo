package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

import objectRepository.Welcomepage;
import objectRepository.LoginPage;
import objectRepository.Homepage;

public class BassClass {
	
	
	public static ExtentReports Ereport;
	public static ExtentTest etest;
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	public JavaUtility Jutil = new JavaUtility();
	public FileUtility Futil = new FileUtility();
	public WebdriverUtility Wutil = new WebdriverUtility();
	public ExcelUtility Eutil = new ExcelUtility();
	public Assertion Ass = new Assertion();
	
	public Homepage hp;
	public LoginPage lp;
	public Welcomepage wp;
	
	@BeforeSuite
	public void reportConfig()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/ExtentReport_"+Jutil.getTimeStamp()+".html");
		Ereport = new ExtentReports();
		Ereport.attachReporter(spark);
		
	}
	
	@Parameters("Browsers")
	@BeforeClass
	public void LaunchingBrowser(@Optional("chrome") String browsername) throws IOException
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		 driver = new ChromeDriver(); 
		}
		else
		{
		 driver = new EdgeDriver();
		}
		Wutil.maximizeWindow(driver);
		Wutil.WaitCommands(driver);
		driver.get(Futil.getPropertyfromproperties("url"));
	}
	@BeforeMethod
		public void Login() throws IOException
		{
		wp = new Welcomepage(driver);
		wp.getLoginLink().click();
		lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(Futil.getPropertyfromproperties("username"));
		lp.getPasswordTextField().sendKeys(Futil.getPropertyfromproperties("password"));
		lp.getLoginButton().click();
	    }
	
	@AfterMethod
	    public void logout()
	    {
	    hp.getLogoutLink().click();
	    }
	
	@AfterClass
	    public void closingBrowsers()
	    {
		driver.quit();
	    }
	
	@AfterSuite
	public void reportBackUp()
	{
		Ereport.flush();
	}

}
