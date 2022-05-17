package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExpleo1 
{
	WebDriver driver;
	
  @Test
  public void LaunchURL() 
  {
	  try 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sekha\\workspace\\Selenium_Project1\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		  driver.get("https://the-internet.herokuapp.com/challenging_dom");
	  } 
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
