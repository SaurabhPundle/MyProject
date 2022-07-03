package testNGListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	
//	onStart
//	onFinish
//	onTestStart
//	onTestSkipped
//	onTestSuccess
//	onTestFailure
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC is failed",true);
		ITestListener.super.onTestFailure(result);
		Reporter.log("Failed TC name is "+result.getName(),true);
	}
	@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("TC is Passed",true);
			ITestListener.super.onTestSuccess(result);
			Reporter.log("TC is Success "+result.getName(),true);
		}
	@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("TC is Skipped, Please check dependant method",true);
			ITestListener.super.onTestSkipped(result);
			Reporter.log("TC is skipped "+result.getName(),true);
		}

}
