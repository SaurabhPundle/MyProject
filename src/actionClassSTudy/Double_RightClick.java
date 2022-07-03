package actionClassSTudy;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        
        Actions ac=new Actions(driver);
        WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        ac.doubleClick(doubleclick).perform();
        
        //alert popup handle
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        WebElement r = driver.findElement(By.xpath("//span[text()='right click me']"));
        ac.contextClick(r).perform();

	}

}
