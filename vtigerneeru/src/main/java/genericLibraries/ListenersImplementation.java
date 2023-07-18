package genericLibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersImplementation implements ITestListener {
	
	ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/suite.html");
	ExtentReports report = new ExtentReports();
	public static ExtentTest logger;

	public void onStart(ITestContext context) {
		report.attachReporter(reporter);
	}
	public void onTestStart(ITestResult result) {
		logger = report.createTest(result.getMethod().getMethodName());
	}
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "This TC is Passed ======"+result.getMethod().getMethodName());
	}
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "This TC is Failed ======"+result.getMethod().getMethodName());
		logger.addScreenCaptureFromPath(Screenshot.takingScreenShot(result.getMethod().getMethodName()));
	}
	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP, "This TC is Skipped ======"+result.getMethod().getMethodName());
	}
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
}
