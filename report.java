package pro;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class report {

	public static void main(String[] args) {
		//blank html
		ExtentSparkReporter rep=new ExtentSparkReporter("C:\\Users\\ELCOT\\eclipse-workspace\\homi\\target\\first.html");
//actual report
		ExtentReports report=new ExtentReports();
		report.attachReporter(rep);
		//test
		ExtentTest test=report.createTest("test1");
		//test cases
		test.pass("login");
		test.pass("email");
		test.pass("password");
		test.pass("successfully logined");
		ExtentTest test2=report.createTest("test2");
		//attach screenshot
		test.fail("paymentfailed",MediaEntityBuilder.createScreenCaptureFromPath("path").build());
		report.flush();
		
		
	}

}
