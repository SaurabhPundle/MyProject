package testNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {
  @Test
  public void myMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
	  System.out.println("myMethod is Running");//only print on console
  }
  @Test
  public void myMethod1()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com"); 
	  Reporter.log("myMethod1 is Running");//print only in report
  }
  @Test
  public void myMethod2()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.manage().window().maximize();
	  driver.get("https://translate.google.com/");
	  Reporter.log("myMethod2 is Running", true);//print on console and report
  }
}
