package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement HD2 = driver.findElement(By.xpath("//div[text()='Recommended Movies']"));
        System.out.println(HD2.getText());
        
        String ActualText = HD2.getText();
        String ExpectedText = "Recommended Movies";
        
        if(ActualText.equals(ExpectedText))
        {System.out.println("Text is correct");}

        else {System.out.println("Text is incorrect");}
		
        		
	}

}
