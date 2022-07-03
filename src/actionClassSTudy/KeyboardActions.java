package actionClassSTudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement email = driver.findElement(By.id("email"));
		Actions ac=new Actions(driver);
		
		ac.sendKeys(email, "saurabh@gamil.com").perform();
		
		ac.keyDown(email, Keys.SHIFT).sendKeys("saurabh").keyUp(Keys.SHIFT).sendKeys("pundle").build().perform();
		
		WebElement pass = driver.findElement(By.id("passContainer"));
		ac.moveToElement(pass).click().keyDown(Keys.SHIFT).sendKeys("happy").keyUp(Keys.SHIFT).sendKeys("1234").build().perform();
		//Thread.sleep(1000);
        WebElement clickeye = driver.findElement(By.xpath("//div[@class='_9lsa']"));
        ac.click(clickeye).perform();
	}

}
