package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathContains {

	public static void main(String[] args) throws InterruptedException {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize(); // maxmise the browser
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("rod");
		
		driver.findElement(By.xpath("(//input[contains(@name,'email')])[2]")).sendKeys("rod2");
		
		
		
		
		
		
	}
}
