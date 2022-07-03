package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        Thread.sleep(200);
        
        //Switch to frame1
        driver.switchTo().frame("frame1");
        
        //switch to frame2
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(frame2);
        
        //Get text of frame2
        WebElement loc2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        String Text2 = loc2.getText();
        System.out.println("Frame2 Text is "+Text2);
        
        //return switch to frame1(parent frame) from frame 2
        driver.switchTo().parentFrame();
        WebElement loc1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        String Text1 = loc1.getText();
        System.out.println("Frame1 Text is "+Text1);
        
        //return to main page
        driver.switchTo().parentFrame();
        WebElement locMain = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
        String TextMain = locMain.getText();
        System.out.println("Main Page Text is "+TextMain);
        
        
	}

}
