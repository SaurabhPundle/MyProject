package testNGSoftAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestSoftAssert {
	SoftAssert soft=new SoftAssert();
	@Test
	  	  public void myMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		  String ExpectedText = "Welcome To Practice Page";
		  WebElement Actual = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	      String ActualText = Actual.getText();
		 
	    
		 soft.assertEquals( ActualText, ExpectedText, "assertEquals-Expected is not equal to Actual TC is failed");
		 Reporter.log("assertequals-Expected is equal to Actual TC is Passed",true);
	     soft.assertNotEquals(ActualText,ExpectedText,"assertNotEquals-Expected text and Actual text is Maching so TC failed");
	     //Reporter.log("assertNotEquals-Expected is not equal to Actual TC is Passed",true);
//	     soft.assertAll();
//	      
//	}
//	      @Test
//		  public void myMethod1() {
//			  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//			  WebDriver driver=new ChromeDriver();
//			  driver.manage().window().maximize();
//			  driver.get("https://vctcpune.com/selenium/practice.html");
			  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	      WebElement SuggetiontextBox = driver.findElement(By.id("displayed-text"));
		  SuggetiontextBox.getText();
		  
		  
		  soft.assertNull(SuggetiontextBox, "Suggetion box is not null TC is failed");
		  soft.assertNotNull(SuggetiontextBox, "Suggetion box is null TC is Failed");
//		  soft.assertAll();
//		 	      }
	  
//		  @Test
//		  public void myMethod2() {
//			  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//			  WebDriver driver=new ChromeDriver();
//			  driver.manage().window().maximize();
//			  driver.get("https://vctcpune.com/selenium/practice.html");
//			  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		  WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));
		  CheckBox1.click();
		  
		//Returns True if Already selected
		 soft.assertTrue(CheckBox1.isSelected(), "Check box is not selected TC is failed");
		 soft.assertFalse(CheckBox1.isSelected(),"Chack box is selected TC is failed");
		 soft.assertAll();
	  }
	
}

