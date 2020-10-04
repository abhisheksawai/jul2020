package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2ScrollElement {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scroll(0,2150)");
		
		//swtiching to frame 2
		
	//	driver.switchTo().frame(1); // going to frame 2 | able to click on element using index 1
	//	System.out.println("into frame");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//input[@id='philadelphia-field-email']")));
		Thread.sleep(4000);
		
		driver.switchTo().frame("a077aa5e");
		//driver is in to frame here 
		System.out.println("into frame");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		driver.switchTo().defaultContent();
		
	}
}