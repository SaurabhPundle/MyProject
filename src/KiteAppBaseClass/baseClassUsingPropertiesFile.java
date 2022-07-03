package KiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtilityClass.UtilityUsingPropertyFile;

public class baseClassUsingPropertiesFile {
	protected WebDriver driver;
	//browser setup
	public void LaunchBrowser() throws IOException{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityUsingPropertyFile.ReadDatafromProperties("URL"));
	
	}
	public void Wait(int timeInMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeInMillis));
		
	}
	
}
