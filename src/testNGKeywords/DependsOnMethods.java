package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	//Method is depend on another methods
	//Sequence after B is D bcz c takes part in last
	@Test
	  public void A() {
		  Reporter.log("My Method A is Running",true);
	  }
	  @Test
	  public void B() {
		  Reporter.log("My Method B is Running",true);
	  }
	  @Test(dependsOnMethods = {"D"})
	  public void C(){
		  Reporter.log("My Method C is Running",true);
	  }
	  @Test
	  public void D() {
		  Reporter.log("My Method D is Running",true);
	  }
	  @Test
	  public void E() {
		  Reporter.log("My Method D is Running",true);
	  }
}
