package waitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		//Implicit-Used for complete webpage loading
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.manage().window().maximize();
		driver.findElement(By.id("wzrk-cancel")).click();

	}

}
