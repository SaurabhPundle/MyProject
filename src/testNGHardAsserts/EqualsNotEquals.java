package testNGHardAsserts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EqualsNotEquals {
  @Test
  public void EqualAndNotEqualMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  String ExpectedText = "Welcome To Practice Page";
	  
	  WebElement Actual = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
      String ActualText = Actual.getText();
	 
//     Assert.assertEquals(ActualText, ExpectedText,"Expected is not equal to Actual TC is failed");
//     Reporter.log("Expected text is equal to Actual text the TC is Passed",true);
     
      Assert.assertNotEquals(ActualText,ExpectedText,"Expected text and Actual text is Maching so TC failed");
      Reporter.log("Actual text and Expected Text is not maching so TC is passed",true); 
  }
  }

