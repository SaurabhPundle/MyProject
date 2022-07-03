package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllKeywordUse {
	//when two keywords(dependsOnMethod & priority) are used in same @Test annotation
	//then TestNG consider first dependsOnMethod then priority
	@Test(dependsOnMethods = {"D"})
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
	  @Test
	  public void D() {
		  Reporter.log("My Method D is Running",true);
	  }
}
