package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProperTiesFile {
	
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		
		File src = new File("E:\\World Of Program\\July2020\\src\\ObjectRepo.properties");
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("normalway");
		
		driver.findElement(By.xpath(pro.getProperty("txt_username_login_facebook"))).sendKeys("abhishek@gmail.com");
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys("August@234");
		driver.findElement(By.xpath(pro.getProperty("login"))).click();
		
		

}
}