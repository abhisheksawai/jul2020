package seleniumBasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("username");
		
		System.out.println("printing something here");
				
	}
}