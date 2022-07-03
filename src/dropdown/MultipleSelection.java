package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleSelection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    Thread.sleep(200);
	    
	    WebElement MulDrop = driver.findElement(By.name("cars"));
	    Thread.sleep(200);
	    Select s=new Select(MulDrop);
	    boolean Result = s.isMultiple();
	    System.out.println("Multiple Selected Result is "+Result);
	    
	    s.selectByIndex(0);
	    Thread.sleep(200);
	    s.selectByValue("saab");
	    Thread.sleep(200);
	    s.selectByVisibleText("Opel");
	    Thread.sleep(200);
	    s.selectByIndex(3);
	    Thread.sleep(200);
	    
	    
	    //deselect method can be used only when multiple selection is available
	    
	    //s.deselectAll();
	    
	    s.deselectByVisibleText("Volvo");
	    System.out.println(s.getFirstSelectedOption().getText());
	    WebElement FSO = s.getFirstSelectedOption();
	    String MyText = FSO.getText();
	    System.out.println("First Selection option "+MyText);
	    
	    System.out.println(s.getAllSelectedOptions().size());
	    
	    for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
	    {
			System.out.println(s.getAllSelectedOptions().get(i).getText());
	    }
			
		}
	    

	}

