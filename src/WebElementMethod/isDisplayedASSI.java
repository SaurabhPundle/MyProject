package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedASSI {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
	Thread.sleep(4000);
	//driver.manage().window().maximize();
	
	WebElement D1 = driver.findElement(By.xpath("//div[@id='myDIV']"));
	Thread.sleep(3000);
	boolean R1 = D1.isDisplayed();
	System.out.println(R1);
Thread.sleep(400);
	driver.findElement(By.xpath("//button[text()='Toggle Hide and Show']")).click();
	Thread.sleep(400);
	boolean R2 = D1.isDisplayed();
	System.out.println(R2);

}
	}


