package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LauchIE {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://paytm.com/");
		
		
	}
}
