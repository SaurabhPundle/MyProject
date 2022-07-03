package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeyStudy {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	Thread.sleep(300);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Saurabh");
	Thread.sleep(300);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	Thread.sleep(300);
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	driver.findElement(By.xpath("//button[@name='login']")).click();
    
    
	

	}

}
