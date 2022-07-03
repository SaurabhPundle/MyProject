package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage1 {
	//1.Variables / data members
	@FindBy(id = "pin") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//2.constructor
	public PinPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.methods
	public void SendPin1(String pin)
	{
		Pin.sendKeys(pin);
	}
	public void ClickOnContinue1()
	{
		ContinueButton.click();
	}
}
