package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNGListener.Listener.class)
public class MyTestClass {
  @Test
  public void Mymethod() {
	  Assert.fail();
	  Reporter.log("I am here",true);
	   }
  @Test(dependsOnMethods = {"Mymethod"})
  public void Mymethod1() {
	  Assert.fail();
	  Reporter.log("I am here1",true);
  }
}
