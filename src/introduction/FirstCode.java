package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.close();
		//driver.quit();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.navigate().to("https://www.w3schools.com/sql");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.manage().window().minimize();
	}
}
