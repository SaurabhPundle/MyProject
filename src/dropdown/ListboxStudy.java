package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		WebElement Month = driver.findElement(By.name("birthday_month"));
		 Thread.sleep(300);
		Select s= new Select(Month);
		Thread.sleep(500);
		s.selectByVisibleText("Nov");
		Thread.sleep(500);
		s.selectByIndex(3);
		Thread.sleep(500);
		s.selectByValue("12");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		 Thread.sleep(300);
		Select s1= new Select(Day);
		Thread.sleep(500);
		s1.selectByVisibleText("12");
		Thread.sleep(500);
		s1.selectByIndex(20);
		Thread.sleep(500);
		s1.selectByValue("30");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Thread.sleep(300);
		Select s2=new Select(Year);
		
		for(int i = 0;i<=30;i++)
		{
			Thread.sleep(400);
			s2.selectByIndex(i);
		}
		boolean result = s2.isMultiple();
		System.out.println("Multilple selection available result - "+result);

	}

}
