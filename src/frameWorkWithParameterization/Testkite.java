package frameWorkWithParameterization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testkite {

		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		File myfile = new File("C:\\Selenium_Excel\\DataType.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		
		int TotalRows = mysheet.getLastRowNum();
		
		for(int i=0;i<=TotalRows;i++)
		{
		String UserNameEX = mysheet.getRow(i).getCell(0).getStringCellValue();
		String PasswordEx= mysheet.getRow(i).getCell(1).getStringCellValue();
		String PinEX = mysheet.getRow(i).getCell(2).getStringCellValue();

		LoginPage1 login=new LoginPage1(driver);
		login.SendUserName1(UserNameEX);
		login.SendPassword1(PasswordEx);
		login.ClickOnLoginButton1();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		PinPage1 Pin=new PinPage1(driver);
		Pin.SendPin1(PinEX);
		Pin.ClickOnContinue1();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		HomePage1 home=new HomePage1(driver);
		home.UserIdValidation1(UserNameEX);
		home.clickOnLogout1();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.ClickOnChangeUser1();
		}driver.close();
	}
}
		
	

