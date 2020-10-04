package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driverf = new FirefoxDriver();
		
		driver.get("https://paytm.com/");
		driverf.get("www.launchingfirefox.com");
		
	}
}
