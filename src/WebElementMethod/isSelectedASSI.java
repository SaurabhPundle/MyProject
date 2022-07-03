package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedASSI {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://smartwebby.com/PHP/Phptips2.asp");
	Thread.sleep(200);
	
	WebElement NETCheck = driver.findElement(By.xpath("//input[@value='.NET']"));
	Thread.sleep(2000);
	driver.manage().window().maximize();
	NETCheck.click();
	if (NETCheck.isSelected()) 
	{
		System.out.println("Check Box is selected");
	} 
	else {
		System.out.println("selecting Check Box");
		NETCheck.click();

	}if (NETCheck.isSelected())
	{
		System.out.println("selection done");
	} else 
	{
		System.out.println("selection Failed");

	}
	

	}

}
