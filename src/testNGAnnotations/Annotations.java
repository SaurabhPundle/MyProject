package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	//Sequence is not mandatory
	@BeforeClass   //Before 1st @Test method
	public void launchBrowser() {
		Reporter.log("Before Class is Running", true);
	}
	@BeforeMethod  //Before every@Test
	public void logIn() {
		Reporter.log("Before Method is Running", true);
	}
  @Test
  public void method1() {
	  Reporter.log("Test Method 1 is Running", true);
  }
  @Test
  public void method2() {
	  Reporter.log("Test Method 2 is Running", true);
  }
  @Test
  public void method3() {
	  Reporter.log("Test Method 3 is Running", true);
  }
  @Test
  public void method4() {
	  Reporter.log("Test Method 4 is Running", true);
  }
  @AfterMethod //After every @Test
  public void logOut() {
	  Reporter.log("After Method is Running", true);
  }
  @AfterClass   //After @Test Method
  public void closeBrowser() {
	  Reporter.log("After Class is Running", true);
  }
  
}
