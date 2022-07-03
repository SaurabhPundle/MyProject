package actionClassSTudy;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement destination = driver.findElement(By.id("bank"));
	Actions f=new Actions(driver);//create Action class object
	//f.dragAndDrop(source, destination).perform();
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
	Thread.sleep(3000);
	f.clickAndHold(source).moveToElement(destination).release().build().perform();
	
	
	}

}
