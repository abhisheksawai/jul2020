package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {
	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public void beforeclass()
	{
		report = new ExtentReports("E:\\World Of Program\\July2020\\src\\ExtentReport.html");
		test = report.startTest("Regression pack 6Sep");
	}
	@AfterClass
	public void afterclass()
	{
		report.endTest(test);
		report.flush();
	}
	
	@Test
	public void verifyLogin()
	{
		System.out.println("two before");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		
		if(driver.getTitle().contains("paytm"))
		{
			test.log(LogStatus.PASS, "yes got the paytm title contains hence pass");
		}
		else
		{
			test.log(LogStatus.FAIL, "no didnt got the paytm title contains hence failed");
				
		}
		
		if(driver.getTitle().equals("paytm"))
		{
			test.log(LogStatus.PASS, "yes got the paytm title hence pass");
		}
		else
		{
			test.log(LogStatus.FAIL, "no didnt got the paytm title hence failed");
				
		}
		
		
		
	}

}
