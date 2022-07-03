package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtilityClass.UtilityUsingPropertyFile;

public class baseClassUsingPropertiesFileFAILSCREENSHOT {
	public static WebDriver driver;
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
	public void screenShot(String TCname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\SreenShot\\FailScreenshot"+TCname+".png");
		FileHandler.copy(src, dest);

	}
}
