package locatorsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(200);
		//use xpath by index because there are 4 results of @type='radio'
		//out of that we want specific radio3 that have index no 3
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
	}

}
