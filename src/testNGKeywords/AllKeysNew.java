package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllKeysNew {
	@Test(dependsOnMethods = {"B"},enabled=false)
	  public void A() {
		  Reporter.log("My Method A is Running",true);
	  }
	  @Test
	  public void B() {
		  Reporter.log("My Method B is Running",true);
	  }
	  @Test
	  public void C(){
		  Reporter.log("My Method C is Running",true);
	  }
	  @Test(priority=-4)
	  public void D() {
		  Reporter.log("My Method D is Running",true);
	  }
	  @Test
	  public void E() {
		  Reporter.log("My Method E is Running",true);
	  }
}
