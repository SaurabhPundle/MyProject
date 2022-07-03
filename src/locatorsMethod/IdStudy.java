package locatorsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.patanjaliayurved.net/category/toothpaste/22");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//by.id
		driver.findElement(By.id("search")).sendKeys("Ghee");
		Thread.sleep(400);
		
		//by.class
		driver.findElement(By.className("dropdown-toggle")).click();
		
		//by.name
		driver.findElement(By.name("search")).clear();
		Thread.sleep(4000);
		
		//by.linked text
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(4000);
		
		//by.partial link text
		driver.findElement(By.partialLinkText("GRIEVANCE")).click();
		Thread.sleep(4000);
		
		//by.tagname
		driver.findElement(By.tagName("input")).sendKeys("xyz");
		
		//

	}

}
