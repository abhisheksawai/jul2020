package jenkinDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngPriority {
	
	@Test
	public void verifyRegistration()  
	{
		System.out.println("verifyRegistration sop testngPriority");
	}
	
	@Test(priority=3)
	public void verifyLogin()
	{
		System.out.println("verifyLogin sop testngPriority 111");
	}

	@Test(priority=1)
	public void verifyBillpayment()
	{
		System.out.println("verifyBillpayment sop testngPriority");
	}
	
}
