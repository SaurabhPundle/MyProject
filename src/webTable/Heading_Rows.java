package webTable;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heading_Rows {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.bankbazaar.com/fuel/petrol-price-maharashtra.html");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    
    WebElement table3 = driver.findElement(By.xpath("(//div//h2)[3]"));
    JavascriptExecutor js = ((JavascriptExecutor)driver);
    js.executeScript("arguments[0].scrollIntoView(true);",table3);
    
    
    //to print head of table
    List<WebElement> Headings = driver.findElements(By.xpath("(//div//h2)[3]"));
    for(WebElement hd:Headings)
    {
    	String hd1 = hd.getText();
    	
    	System.out.print(hd1+" ");
    }
    
    //to print row of table
    List<WebElement> row1 = driver.findElements(By.xpath("(//div//table)[3]//tr"));
    System.out.println();
    System.out.println("size of row is "+row1.size());
    for (WebElement a:row1)
    {
    	String a1 = a.getText();
    	System.out.println(a1);
    }
    Thread.sleep(6000);
    
    //this statement shows exception
   // driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	}

}
