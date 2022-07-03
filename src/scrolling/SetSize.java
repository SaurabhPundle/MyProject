package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//to get size
		System.out.println(driver.manage().window().getSize());
		//to set size
		Dimension d=new Dimension(500,400);
		Thread.sleep(3000);
		driver.manage().window().setSize(d);

	}

}
