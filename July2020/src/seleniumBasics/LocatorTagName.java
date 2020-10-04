package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName {

	public static void main(String[] args) throws InterruptedException {

		// i want to launch the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize(); // maxmise the browser
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.id("email")).sendKeys("akash");
		
		//driver.findElement(By.name("email")).sendKeys("Vindo");
		
	//	driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("classnameuser");
		
	//	driver.findElement(By.className("inputtext")).sendKeys("classnameuser");
	//	driver.findElement(By.className("inputtext")).sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.tagName("input")).sendKeys("mobile");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
