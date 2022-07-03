package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDiplyed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(300);
		WebElement D1 = driver.findElement(By.id("displayed-text"));
		Thread.sleep(300);
		
		boolean result1 = D1.isDisplayed();
		System.out.println(result1);
		Thread.sleep(300);
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(300);
		System.out.println(D1.isDisplayed());
	
		
		
		
		 

	}

}
