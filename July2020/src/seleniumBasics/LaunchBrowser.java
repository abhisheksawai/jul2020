package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		
	}
}
