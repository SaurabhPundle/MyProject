package popUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ele.click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		
		alt.accept(); //used to click on ok
		//alt.dismiss();  //used to click on cancel
		
		
		
	}

}
