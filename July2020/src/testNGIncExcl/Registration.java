package testNGIncExcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Registration {
	
	@Test
	public void RegistrationOne()
	{
		System.out.println("Include exclude - RegistrationOne");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
	}
	@Test
	public void RegistrationTwo()
	{
		System.out.println("Include exclude - RegistrationTwo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
	}
	@Test
	public void RegistrationThree()
	{
		System.out.println("Include exclude - RegistrationThree");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
	}
	
	@Test
	public void RegistrationFour()
	{
		System.out.println("Include exclude - RegistrationFour");
	}
}
