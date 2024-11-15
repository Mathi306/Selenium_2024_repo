package genericUtility;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JavaUtility {
	public WebDriver driver;
	
	
	public String getTimeStamp()
	{
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

	public int RandomNumbers()
	{
		Random Ran = new Random();
		return Ran.nextInt(1000);
	}

}
