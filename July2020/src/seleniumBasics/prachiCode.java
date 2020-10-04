package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class prachiCode {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("browser launched");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		
		try {
			element.click();
			Thread.sleep(1200);
			}catch(Exception e) {
			
				System.out.println(e);
				
			}
		
//			try {
//			JavascriptExecutor executor = (JavascriptExecutor)Driver;
//			Thread.sleep(1200);
//			executor.executeScript("arguments[0].click();", element);
//			Thread.sleep(1200);
//			}catch(Exception ae) {
//			Actions builder = new Actions(Driver);
//			Thread.sleep(1200);
//			Action mouseOverHome = builder.moveToElement(element).click().build();
//			Thread.sleep(1200);
//			mouseOverHome.perform();
//			Thread.sleep(1200);
	}

}

