package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
	@BeforeMethod
	public void myBMethod(){
	Reporter.log("My BMethod is Running",true);	
	}
  @Test(invocationCount = 4)
  public void myMethod() {
	  Reporter.log("My Method is Running",true);
  }
  @AfterMethod
  public void myMethoh() {
	  Reporter.log("My AMethod is Running",true);
  }
}
