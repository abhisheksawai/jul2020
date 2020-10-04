package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngPriority4 {
	
	@Test
	public void verifyRegistration()  
	{
		System.out.println("verifyRegistration sop");
	}
	
	@Test(priority=3)
	public void verifyLogin()
	{
		System.out.println("verifyLogin sop");
	}

	@Test(priority=1)
	public void verifyBillpayment()
	{
		System.out.println("verifyBillpayment sop");
	}
	
}
