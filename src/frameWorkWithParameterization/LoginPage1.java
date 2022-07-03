package frameWorkWithParameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	//1.Data members/ Variables
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id ="password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	@FindBy(linkText = "Change user") private WebElement ChangeUserButton;
	
	//2.Constructor
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3.methods
	public void SendUserName1(String UserName)
	{
		UN.sendKeys(UserName);
	}
	public void SendPassword1(String Pass)
	{
		PWD.sendKeys(Pass);
	}
	public void ClickOnLoginButton1()
	{
		LoginButton.click();
	}
	public void ClickOnChangeUser1()
	{
		ChangeUserButton.click();
	}
	
}
