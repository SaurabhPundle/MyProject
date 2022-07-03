package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
	
	public HomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String ActualUserID()
	
	{
		String Actual = UserId.getText();
		return Actual;
	}
	
	public void UserIdValidation1(String ExpectedUserID)
	{
		String Actual = UserId.getText();
		String Expected = ExpectedUserID;
		
		if(Actual.equals(Expected))
		{
			System.out.println("Text is Maching,Test case is pass");
		}
		else{System.out.println("Text is not Maching,Test case is fail");}
	}
		public void clickOnLogout1() throws InterruptedException
		{
			UserId.click();
			Thread.sleep(1000);
			LogOut.click();
		}
	

}
