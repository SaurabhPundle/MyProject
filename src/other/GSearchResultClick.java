package other;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSearchResultClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.name("q")).sendKeys("tata ev");
		
   		String expected = "tata evision";
		 List<WebElement> tatalist = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		 Thread.sleep(1000);
		 for(WebElement li:tatalist)
		 {
			 System.out.println(li.getText());
			 String actual0 = li.getText();
			 if(expected.equals(actual0)) 
			 {
				 li.click();
				 break;
			 }	 
		 }
		 driver.findElement(By.linkText("News")).click();
		
//		 String expected = "tata evision";{
//		 for(WebElement results:tatalist) {
//			 String actual = results.getText();
//			 if (actual.equals(expected)) {
//				 results.click();
//				 break;
//			 }
//		 }
		
	}
}


