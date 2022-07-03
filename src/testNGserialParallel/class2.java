package testNGserialParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 {
	@Test
	  public void myMethod1()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com"); 
		  Reporter.log("myMethod1 is Running");
	  }
	 
	}
