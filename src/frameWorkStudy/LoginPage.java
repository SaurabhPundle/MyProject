package frameWorkStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//1.Data members/ Variables
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id ="password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2.Constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3.methods
	public void SendUserName()
	{
		UN.sendKeys("ELR321");
	}
	public void SendPassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
	
}
