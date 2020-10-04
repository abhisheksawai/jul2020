package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testngDependent {
	
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

	@Test(dependsOnMethods = "verifyLogin")
	public void verifyBillpayment()
	{
		System.out.println("e");}
	
}
