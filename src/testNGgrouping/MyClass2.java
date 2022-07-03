package testNGgrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
	@Test(groups = "sanity")
	  public void method6() {
		  Reporter.log("My Method 6 is Running",true);
	  }
	  @Test
	  public void method7() {
		  Reporter.log("My Method 7 is Running",true);
	  }
	  @Test(groups = "regression")
	  public void method8(){
		  Reporter.log("My Method 8 is Running",true);
	  }
	  @Test
	  public void method9() {
		  Reporter.log("My Method 9 is Running",true);
	  }
	  @Test(groups = "sanity")
	  public void method10() {
		  Reporter.log("My Method 10 is Running",true);
	  }

}
