package testNGserialParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 {
	 @Test
	  public void myMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		  Reporter.log("myMethod is Running",true);
	  }
	  

}
