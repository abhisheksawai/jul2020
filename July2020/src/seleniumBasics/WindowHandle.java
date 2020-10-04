package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		System.out.println("title of current url is "+driver.getTitle());
		driver.manage().window().maximize();		
		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();  // another window opened
		
		System.out.println(driver.getWindowHandle());
		//String winh = "CDwindow-B46EE73E6E6CECC72D96D96A7808FFF6";
				
		System.out.println("title of second url is "+driver.getTitle());
		
	}
}