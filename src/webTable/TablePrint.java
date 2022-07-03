package webTable;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TablePrint {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
	JavascriptExecutor j = ((JavascriptExecutor)driver);
	WebElement head1 = driver.findElement(By.xpath("(//legend)[8]"));
	j.executeScript("arguments[0].scrollIntoView(true);", head1);
	System.out.println(head1.getText());
	
     List<WebElement> hd = driver.findElements(By.xpath("//table//th"));//heading or columns
	 List<WebElement> row = driver.findElements(By.xpath("//table//tr"));//rows
	 System.out.println("Total no of rows "+row.size());
	 System.out.println("Total no Headings/columns are "+hd.size());
//	 for(WebElement a:hd) {
//		System.out.print(a.getText()+"  ");
//		System.out.println();
//		}
		
		for(int i=1;i<=row.size();i++)
		{
			for(int j1=1;j1<=hd.size();j1++)
			{
				if(i==1)
				{
					String heading= driver.findElement(By.xpath("//table//tr["+i+"]//th["+j1+"]")).getText();
					System.out.print(heading+"    ");
				}
				else 
				{
					String body = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j1+"]")).getText();
					System.out.print(body+"    ");
				}
			
		}
		System.out.println();
			
	}

	}
}
		
	


