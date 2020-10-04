package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNGDemo.ListernerDemo.class)
public class SampleListerProg {
	
	@Test
	public void testone()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
	}
	
	@Test
	public void testtwo()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(10, 23);
		System.out.println("Test 2 ended");
	}

	@Test(enabled = false)
	public void verifyBillpayment()
	{
		System.out.println("e");
	}
	@Test
	public void testthree3()
	{
		System.out.println("testthree3");
	}
	@Test
	public void testthree()
	{
		System.out.println("testthree");
	}
}
