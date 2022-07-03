package testNGFailed;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class f2 {
	  @Test
	  public void method6() {
		  Assert.fail();
		  Reporter.log("My Method 6 is Running",true);
	  }
	  @Test
	  public void method7() {
		  Reporter.log("My Method 7 is Running",true);
	  }
	  @Test
	  public void method8(){
		  Reporter.log("My Method 8 is Running",true);
	  }
	  @Test
	  public void method9() {
		  Reporter.log("My Method 9 is Running",true);
	  }
	  @Test
	  public void method10() {
		  Reporter.log("My Method  is Running",true);
	  }

  
}
