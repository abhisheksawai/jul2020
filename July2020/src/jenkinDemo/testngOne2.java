package jenkinDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngOne2 {
	
	@Test(priority=1)  
	public void verifyRegistration()  
	{
		System.out.println("verifyRegistration sop testngOne2 class ");
	}
	
	@Test(priority=3)
	public void verifyLogin()
	{
		System.out.println("verifyLogin sop testngOne2 class");
	}

	@Test(priority=2)
	public void verifyBillpayment()
	{
		System.out.println("verifyBillpayment sop testngOne2 class");
	}
	
}
