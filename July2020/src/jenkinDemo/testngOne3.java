package jenkinDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngOne3 {
	
	@Test
	public void verifyRegistration()  
	{
		System.out.println("verifyRegistration sop testngOne3");
	}
	
	@Test(priority=3)
	public void verifyLogin()
	{
		System.out.println("verifyLogin sop testngOne3");
	}

	@Test(priority=2)
	public void verifyBillpayment()
	{
		System.out.println("verifyBillpayment sop testngOne3");
	}
	
}
