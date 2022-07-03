package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableNew {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myvi.in/account/login");
		Thread.sleep(200);
		WebElement sendOTPButton = driver.findElement(By.xpath("//button[text()='send OTP']"));
		boolean resultA = sendOTPButton.isEnabled();
		Thread.sleep(300);
		System.out.println("Before Result "+resultA);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8796502870");
		Thread.sleep(5700);
		
		boolean resultB = sendOTPButton.isEnabled();
		System.out.println("After result "+resultB);
		
		
	}

}
