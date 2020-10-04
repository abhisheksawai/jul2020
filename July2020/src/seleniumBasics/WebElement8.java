package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement8 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		
		WebElement elementhere = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		System.out.println("foracc gettext here "+elementhere.getText());
		
		WebElement elementhereEmail = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println("email elemenet gettext here "+elementhereEmail.getText());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getText());
	}

}
