package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLaunchBrowser {
	
	@Test  // annotation from testng , which indicate your test case
	public void tc_verifylaunchpaytm()  // test cases ,i can have multpile test acses in a class
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		System.out.println("url launched paytm");
	}
	
	@Test
	public void tc_launchfacebook()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		System.out.println("url launched fb");
	}

}
