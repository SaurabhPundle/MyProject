package waitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		WebElement Pr1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
		Pr1.click();
		//Explicit-Used for single element loading
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOf(Pr1));
		driver.quit();
		
		

	}

}
