package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DMNavigate {

	public static void main(String[] args) throws InterruptedException {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.navigate().to("https://www.paytm.com/");
		Thread.sleep(3000);
		
		System.out.println("browser launched paytm here");
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("browser back here");
		
		driver.navigate().forward();
		
	}
}
