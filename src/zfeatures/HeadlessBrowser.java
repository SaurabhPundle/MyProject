package zfeatures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//using headless we can't see an browser
		opt.addArguments("--headless");//Replace this for Incognito browsing("incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		File myfile=new File("C:\\Selenium_Excel\\DataType.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		
		UserID.sendKeys(UN);
		Password.sendKeys(PWD);
		LoginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		pin.sendKeys(PIN);
		continueButton.click();
		
		Thread.sleep(5000);
		driver.close();
	}


	}


