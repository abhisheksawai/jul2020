package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testngDependent4 {
	
	@Test
	public void verifyLogin()
	{
		System.out.println("two before");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("wrongxpath")).click();
		System.out.println("two after");
		System.out.println("d");
		
	}
	@Test(dependsOnMethods = {"verifyLogin","one"})
	public void verifyBillpayment()
	{
		System.out.println("e");
	}
	@Test
	public void one()
	{
		System.out.println("one");
	}
}
