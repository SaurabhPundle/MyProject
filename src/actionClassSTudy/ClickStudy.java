package actionClassSTudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickStudy {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//move to element + click by using mouse action
	//create action class object
	Actions a=new Actions(driver);
	WebElement moveto = driver.findElement(By.xpath("//button[@name='login']"));
	//1st way
//	a.moveToElement(moveto).perform();
//	a.click().perform();
//	Thread.sleep(1000);
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	//2nd way
//	a.moveToElement(moveto).click().build().perform();
//	Thread.sleep(1000);
//	driver.navigate().back();
//	Thread.sleep(2000);
	
	//3rd way
	a.click(moveto).perform();
	Thread.sleep(1000);
	driver.navigate().back();
	
	
	}
}
