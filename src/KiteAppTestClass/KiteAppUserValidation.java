package KiteAppTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.baseClass;
import KiteAppPOM.HomePage1;
import KiteAppPOM.LoginPage1;
import KiteAppPOM.PinPage1;
import kiteAppUtilityClass.UtilityClass;

public class KiteAppUserValidation extends baseClass {
	LoginPage1 LOgin;
	PinPage1 PIn;
	HomePage1 HOme;
	@BeforeClass
	public void launchBrowser()
	{
		LaunchBrowser();
		LOgin=new LoginPage1(driver);
		PIn=new PinPage1(driver);
		HOme=new HomePage1(driver);
		
	}
	@BeforeMethod
	public void LoginToKite() throws EncryptedDocumentException, IOException
	{
		LOgin.SendUserName1(UtilityClass.ReadDataFromExcel(0, 0));
		LOgin.SendPassword1(UtilityClass.ReadDataFromExcel(0, 1));
		LOgin.ClickOnLoginButton1();
		Wait(driver, 1000);
		PIn.SendPin1(UtilityClass.ReadDataFromExcel(0, 2));
		PIn.ClickOnContinue1();
		Wait(driver, 1000);
	}
  @Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException 
  {
	  String Actual = HOme.ActualUserID();
	  String Expected = UtilityClass.ReadDataFromExcel(0, 0);
	  
	  Assert.assertEquals(Actual, Expected,"ActualUI and ExpectedUI are not maching TC is Failed");
	  Reporter.log("ActualUI and ExpectedUI are Maching TC is passed",true);
  }
  @AfterMethod
  public void LogOut() throws InterruptedException
  {
	  HOme.clickOnLogout1();
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
