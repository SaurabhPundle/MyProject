package testNGHardAsserts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TrueFalse {
  @Test
  public void myMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  
	  WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));
	  //CheckBox1.click();
	  //Returns True if Already selected
//	  Assert.assertTrue(CheckBox1.isSelected(), "Check box is not selected TC is failed");
//	  Reporter.log("Check box is selected TC is passed",true);
	  
	  //Returns true when already not selected
	  Assert.assertFalse(CheckBox1.isSelected(), "Check Box is selected TC is failed");
	  Reporter.log("Check box is not selected TC is Passed",true);
	  
  }
}
