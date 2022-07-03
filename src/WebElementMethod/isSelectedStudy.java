package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedStudy {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(200);
	
	driver.manage().window().maximize();
	WebElement CB2 = driver.findElement(By.id("checkBoxOption2"));
	Thread.sleep(200);
	if(CB2.isSelected())
	{
		System.out.println("Check box is already selected");
	}
	else {
		System.out.println("Selecting check box");
		CB2.click();
		
		if(CB2.isSelected())
		{
			System.out.println("Check box is selected");
		}
		else {
			System.out.println("Failed to Selecting check box");
			
			
		
	}
	

	}
	}
}
