package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement10 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Jul Jar binding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launched");
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		
		WebElement facebookLogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		System.out.println(facebookLogo.isDisplayed());
		
		if(facebookLogo.isDisplayed())
		{
			System.out.println("Yes logo is there hence pass the test case");
		}
		
		else
		{
			System.out.println("logo is not there hence failed the test acse ");
		}
		
		
		
	}

}
