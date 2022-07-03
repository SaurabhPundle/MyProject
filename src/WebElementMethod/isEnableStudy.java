package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		Thread.sleep(500);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("(//div[@class='sc-cMljjf ilbRNt'])[2]")).click();
		
		Thread.sleep(8000);
		WebElement contiButton=driver.findElement(By.xpath("//button[text()='Continue']"));
		boolean result1=contiButton.isEnabled();

		System.out.println("Continue button status before I/P "+result1);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("xyz@gmail.com");
        Thread.sleep(5000);
        
        boolean result2=contiButton.isEnabled();
        System.out.println("Continue button status After I/P "+result2);
	
		}

}
