package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser3 {

	public static void main(String[] args) {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
	//	WebDriver driver2 = new WebDriver();
		
		ChromeDriver driverc = new ChromeDriver();
		FirefoxDriver driverf = new FirefoxDriver();
		
		driver.get("https://paytm.com/");
		driverf.get("www.launchingfirefox.com");
		
	}
}
