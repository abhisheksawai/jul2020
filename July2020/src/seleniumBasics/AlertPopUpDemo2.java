package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpDemo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("print for alert tetx");
		System.out.println(driver.switchTo().alert().getText());
		
		
		
	}

}
