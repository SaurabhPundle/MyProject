package testNGHardAsserts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NullNotNull {
  @Test
  public void myMethod() {
//	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//	  WebDriver driver=new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("https://vctcpune.com/selenium/practice.html");
//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//	  
//	  WebElement SuggetiontextBox = driver.findElement(By.id("displayed-text"));
//	  SuggetiontextBox.getText();
//	  Assert.assertNull(SuggetiontextBox, "Suggetion box is not null TC is failed");
//	  Reporter.log("Suggetion box is Null TC is passed",true);
//
//	  
//	  Assert.assertNotNull(SuggetiontextBox, "Suggetion boxis null TC is Failed");
//	  Reporter.log("Suggetion box is Not Null TC is Passed",true);
	  
	  String s=null;
	  String a="Bharat";
	  
	  Assert.assertNotNull(a,"TC is failed");
	  System.out.println("TC is passed");
	  
	  Assert.assertNull(s,"TC is failed");
	  System.out.println("TC is passed");
  }
}
