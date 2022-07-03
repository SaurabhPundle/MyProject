package testNGListener;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteAppBaseClass.baseClassUsingPropertiesFileFAILSCREENSHOT;

public class ListenerForFAILSCEENSHOT implements ITestListener{
baseClassUsingPropertiesFileFAILSCREENSHOT b=new baseClassUsingPropertiesFileFAILSCREENSHOT();//created object of base class
	@Override
	public void onTestFailure(ITestResult result) {
		 String TCname = result.getName();
		 {
		try {
			b.screenShot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("Test Passed- "+result.getMethod(),true);
			ITestListener.super.onTestSuccess(result);
		}
	@Override
		public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Skipped- "+result.getMethod(),true);
			ITestListener.super.onTestSkipped(result);
		}
}
