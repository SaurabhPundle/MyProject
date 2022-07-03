package collectionApplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfdropdownValue {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	List<WebElement> dropdn = driver.findElements(By.tagName("a"));
	//try it for dropdown
	System.out.println(dropdn.size());
	for(int i=0;i<=dropdn.size()-1;i++) {
		System.out.println(dropdn.get(i).getText());
	}

	}

}
