package KiteAppTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.baseClassUsingPropertiesFile;
import KiteAppPOM.HomePage1;
import KiteAppPOM.LoginPage1;
import KiteAppPOM.PinPage1;
import kiteAppUtilityClass.UtilityUsingPropertyFile;

public class KiteAppUserValidationUsingPropertiesFile extends baseClassUsingPropertiesFile {
	LoginPage1 LOgin;
	PinPage1 PIn;
	HomePage1 HOme;
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		LaunchBrowser();
		LOgin =new  LoginPage1(driver);
		PIn =new PinPage1(driver);
		HOme=new HomePage1(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		LOgin.SendUserName1(UtilityUsingPropertyFile.ReadDatafromProperties("UN"));
		LOgin.SendPassword1(UtilityUsingPropertyFile.ReadDatafromProperties("PWD"));
		LOgin.ClickOnLoginButton1();
		Wait(1000);
		PIn.SendPin1(UtilityUsingPropertyFile.ReadDatafromProperties("PIN"));
		PIn.ClickOnContinue1();
		Wait(1000);
	}
	
  @Test
  public void KiteUserIDValidation() throws IOException {
	  String ActualUI = HOme.ActualUserID();
	  String ExpectedUI = UtilityUsingPropertyFile.ReadDatafromProperties("UN");
	  Assert.assertEquals(ActualUI, ExpectedUI, "Actual and Expected is not match TC is Failed");
	  Reporter.log("ActualUI and ExpectedUI is Match TC is passed",true);
	  UtilityUsingPropertyFile.takeScreenShot(driver);
  }
  @AfterMethod
  public void logOutTokite() throws InterruptedException
  {
	  HOme.clickOnLogout1();
  }
  @AfterClass
  public void CloseBrowser()
  {
	  
	  driver.close();
  }
  
  
}
