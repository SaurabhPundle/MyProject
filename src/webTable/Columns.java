package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Columns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/fuel/petrol-price-maharashtra.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement tableco = driver.findElement(By.xpath("//h2[text()='Trends in Petrol Prices in Mumbai']"));
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].scrollIntoView(true);", tableco);
		
		List<WebElement> columnsv = driver.findElements(By.xpath("(//div//table)[8]//td"));
		System.out.println("size of column values "+columnsv.size());
		
		for (WebElement c:columnsv) {
			System.out.println();
			System.out.print(c.getText()+"  ");
			
		}
		
		
		
	}

}
