package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	//When method is time consuming then TestNG fail that method
	@Test
	  public void A() {
		  Reporter.log("My Method A is Running",true);
	  }
	  @Test
	  public void B() {
		  Reporter.log("My Method B is Running",true);
	  }
	  @Test(timeOut = 1000)
	  public void C() throws InterruptedException {
		  Thread.sleep(1002);
		  Reporter.log("My Method C is Running",true);
	  }
	  @Test
	  public void D() {
		  Reporter.log("My Method D is Running",true);
	  }
	  
}
