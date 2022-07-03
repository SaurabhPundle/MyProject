package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//+=x  Right side
		//-=x  Left side
		//+=Y  Down side
		//-=Y  Up side
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(20,4000)");//For Down 
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(40,-3000)");//For up
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(4000,60)"); //For Right side
		Thread.sleep(1000);
		j.executeAsyncScript("window.scrollBy(-3000,40)"); //For Left side
		
		

	}

}
