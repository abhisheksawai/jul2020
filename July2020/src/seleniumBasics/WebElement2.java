package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		
		
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shishir");
		//int i = 5;
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("akash");

		
	}

}
