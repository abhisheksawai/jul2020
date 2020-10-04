package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2Scroll {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,2150)");
		
		//swtiching to frame 2
		
		driver.switchTo().frame(1); // going to frame 2
		System.out.println("into frame");
		
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		

}
}