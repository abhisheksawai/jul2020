package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngPriority6 {
	
	@Test(priority=-1)
	public void alind()  
	{
		System.out.println("a");
	}
	
	@Test(priority=0)
	public void shishir()  
	{
		System.out.println("b");
	}
	
	@Test
	public void verifyPostpaid()  
	{
		System.out.println("c");
	}
	
	@Test(priority=3)
	public void verifyLogin()
	{
		System.out.println("d");
	}

	@Test(priority=3)
	public void verifyBillpayment()
	{
		System.out.println("e");
	}
	
}
