package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
	//Priority is in + ve integer, -ve integer,duplicate,
	//priority cannot be decimal, variables
  @Test(priority = 2)
  public void A() {
	  Reporter.log("My Method A is Running",true);
  }
  @Test(priority = 4)
  public void B() {
	  Reporter.log("My Method B is Running",true);
  }
  @Test(priority =1)
  public void C() {
	  Reporter.log("My Method C is Running",true);
  }
  @Test(priority =3)
  public void D() {
	  Reporter.log("My Method D is Running",true);
  }
  
}
