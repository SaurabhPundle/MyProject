package frameWorkStudy;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testkite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		LoginPage login=new LoginPage(driver);
		login.SendUserName();
		login.SendPassword();
		login.ClickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		PinPage Continue=new PinPage(driver);
		Continue.SendPin();
		Continue.ClickOnContinue();
		
		HomePage Home=new HomePage(driver);
		Home.UserIdValidation();
		Home.clickOnLogout();
		driver.close();
	}

}
