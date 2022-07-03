package KiteAppBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	protected WebDriver driver;
	//browser setup
	public void LaunchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	}
	public void Wait(WebDriver driver,int timeInMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeInMillis));
		
	}
	
}
