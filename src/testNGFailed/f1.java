package testNGFailed;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class f1 {
 
	  @Test
	  public void method1() {
		  Reporter.log("My Method 1 is Running",true);
	  }
	  @Test
	  public void method2() {
		  Reporter.log("My Method 2 is Running",true);
	  }
	  @Test
	  public void method3(){
		  Reporter.log("My Method 3 is Running",true);
	  }
	  @Test
	  public void method4() {
		  Reporter.log("My Method 4 is Running",true);
	  }
	  @Test
	  public void method5() {
		  Reporter.log("My Method 5 is Running",true);
	  }

  
}
