package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testngDependent2 {
	
	@Test
	public void verifyPostpaid()  
	{
		System.out.println("c");
	}
	
	@Test
	public void verifyLogin()
	{
		System.out.println("d");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		System.out.println("url launched");
		driver.findElement(By.xpath("wrongxpath")).click();
	}

	@Test(dependsOnMethods = "verifyLogin")
	public void verifyBillpayment()
	{
		System.out.println("e");}
	
}
