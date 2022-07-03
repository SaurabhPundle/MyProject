package locatorsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//Input[@id='checkBoxOption1']")).click();
		Thread.sleep(300);
		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

	}

}
