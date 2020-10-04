package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngSkip2 {
	
	@Test
	public void verifyPostpaid()  
	{
		System.out.println("c");
	}
	
	@Test
	public void verifyLogin()
	{
		System.out.println("d");
	}

	//@Test(enabled = false)
	public void verifyBillpayment()
	{
		System.out.println("e");
	}
	
}
