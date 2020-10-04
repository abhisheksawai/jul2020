package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testngSkip3 {
	
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

	@Test
	public void verifyBillpayment()
	{
		System.out.println("e");
		int age = 20;
		if(age > 10)
		{
			throw new SkipException("age is greater than 20 henc skpi");
		}
		}
	
}
