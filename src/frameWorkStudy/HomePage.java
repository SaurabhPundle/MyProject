package frameWorkStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserIdValidation()
	{
		String Actual = UserId.getText();
		String Expected = "ELR321";
		
		if(Actual.equals(Expected))
		{
			System.out.println("Text is Maching,Test case is pass");
		}
		else{System.out.println("Text is not Maching,Test case is fail");}
	}
		public void clickOnLogout() throws InterruptedException
		{
			UserId.click();
			Thread.sleep(1000);
			LogOut.click();
		}
		

}
