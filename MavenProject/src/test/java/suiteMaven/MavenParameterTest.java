package suiteMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameterTest {
	
	@Test
	public void receiveData()
	{
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		System.out.println(username);
		System.out.println(password);
	}

}
