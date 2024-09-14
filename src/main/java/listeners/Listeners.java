package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import utilities.ExtentReporter;

public class Listeners extends Base implements ITestListener {
	
	public WebDriver driver ;
	ExtentReports extentReports = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	
	ThreadLocal<ExtentTest> extentTestThread  = new ThreadLocal<ExtentTest>();
			




	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();
		
		
		 extentTest = extentReports.createTest(testName);
		 
		 extentTestThread.set(extentTest);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String  testName = result.getName();
		//extentTest.log(Status.PASS, testName+ "got passed ");
		
		extentTestThread.get().log(Status.PASS, testName+ "got passed ");
				//this is passsing for extent repports only
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		
		String testName = result.getName();
		
		//extentTest.fail(result.getThrowable());
		extentTestThread.get().fail(result.getThrowable());
		
		
		
		
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			String destinationFilePath = takeScreenshot(testName,driver);
			
			extentTestThread.get().addScreenCaptureFromPath(destinationFilePath,testName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		extentReports.flush(); // this method is main reason that logs for  extent reports is generated
	}
	
	

}
