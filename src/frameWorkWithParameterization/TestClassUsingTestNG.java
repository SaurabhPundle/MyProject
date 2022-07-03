package frameWorkWithParameterization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClassUsingTestNG {
	LoginPage1 login2;
	PinPage1 pin2;
	HomePage1 home2;
	WebDriver driver;
	Sheet Mysheet2;
	
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching url....");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		home2=new HomePage1(driver);
		login2=new LoginPage1(driver);
		pin2=new PinPage1(driver);
		File myfile2 = new File("C:\\Selenium_Excel\\DataType.xlsx");
		Mysheet2=WorkbookFactory.create(myfile2).getSheet("Sheet4");
		
	}
	@BeforeMethod
	public void loginToKiteApp()
	{
		login2.SendUserName1(Mysheet2.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending UserName....",true);
		login2.SendPassword1(Mysheet2.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending Password....",true);
		login2.ClickOnLoginButton1();
		Reporter.log("Clicking on LogIn Button....",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin2.SendPin1(Mysheet2.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending Pin....",true);
		pin2.ClickOnContinue1();
		Reporter.log("Clicking on Continue Button....",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
 	
	@Test
	public void validationNG()
	{  
		String ActualUI = home2.ActualUserID();
		String ExpectedUI = Mysheet2.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(ActualUI, ExpectedUI,"UserID is not Maching TC is Failed");
		Reporter.log("UserID is maching TC is Passed",true);
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		home2.clickOnLogout1();
		Reporter.log("Clicking on LogOut....",true);
	}
	@AfterClass
	public void closeBrower()
	{
		driver.close();
		Reporter.log("Closeing Browser....",true);
	}
	
}
