package scrolling;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//to get position
		System.out.println(driver.manage().window().getPosition());
		//to set position
		//Use point class and create object of point class
		 Point p=new Point(30, 70);
		 Thread.sleep(3000);
		 driver.manage().window().setPosition(p);
	}

}
