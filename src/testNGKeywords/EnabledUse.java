package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
	// disabling test case
	@Test
	  public void A() {
		  Reporter.log("My Method A is Running",true);
	  }
	  @Test
	  public void B() {
		  Reporter.log("My Method B is Running",true);
	  }
	  @Test(enabled = false)
	  public void C() {
		  Reporter.log("My Method C is Running",true);
	  }
	  @Test
	  public void D() {
		  Reporter.log("My Method D is Running",true);
	  }
	  
}
