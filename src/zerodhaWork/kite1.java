package zerodhaWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys("ELR321");
		Password.sendKeys("Dhana1111");
		LoginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continueButton.click();
		
		WebElement UserDetails = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualText = UserDetails.getText();
		String expectedText = ("ELR321");
	
		if(actualText.equals(expectedText))
		{
			System.out.println("Text is as per requirement");
		}
		else {
			System.out.println("Text is not as per requirement");
		}
		UserDetails.click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
