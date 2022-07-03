package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseOfXMLforListener2 {
  @Test
  public void Method3() {
	  Assert.fail();
	  Reporter.log("Method1 is running",true);
  }
  @Test(dependsOnMethods= {"Method3"})
  public void Method4() {
	  Reporter.log("Method2 is running",true);
  }
}
