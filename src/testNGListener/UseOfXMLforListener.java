package testNGListener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseOfXMLforListener {
  @Test
  public void Method1() {
	  Reporter.log("Method1 is running",true);
  }
  @Test
  public void Method2() {
	  Reporter.log("Method2 is running",true);
  }
}
