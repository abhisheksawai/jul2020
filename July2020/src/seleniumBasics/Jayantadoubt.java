package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jayantadoubt {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("browser launched");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		// create something here in flipt cart with ab role
		
		
		//launching another website for cd role
		driver.get("https://www.facebook.com/");
		// and do you ope here
		
	
		
		
		
	}

}

