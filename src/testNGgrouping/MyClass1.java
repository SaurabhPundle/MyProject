package testNGgrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
	
	@Test(groups = "sanity")
	  public void method1() {
		  Reporter.log("My Method 1 is Running",true);
	  }
	  @Test
	  public void method2() {
		  Reporter.log("My Method 2 is Running",true);
	  }
	  @Test(groups="regression")
	  public void method3(){
		  Reporter.log("My Method 3 is Running",true);
	  }
	  @Test
	  public void method4() {
		  Reporter.log("My Method 4 is Running",true);
	  }
	  @Test(groups = "sanity")
	  public void method5() {
		  Reporter.log("My Method 5 is Running",true);
	  }

}
