package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement11 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		System.out.println(username.isEnabled());
		
		if(username.isEnabled())
		{
			System.out.println("Yes userid is isEnabled hence pass the test case");
		}
		
		else
		{
			System.out.println("logo is not Enabled hence failed the test acse ");
		}
		
		
		
	}

}
