package testNGcrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SimpleEdgeRun {
	
  @Test
  public void OpenFacebook() {
	  System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  driver.get("https://www.facebook.com/");
  }
}
