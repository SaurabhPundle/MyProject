package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://vctcpune.com");
		String Title = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		System.out.println(driver.getCurrentUrl());

	}
}
